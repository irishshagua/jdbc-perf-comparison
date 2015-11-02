package com.mooneyserver.jdbc_perf.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;

import com.mooneyserver.jdbc_perf.DbDetails;
import com.mooneyserver.jdbc_perf.PerfBenchmarks;

@State(Scope.Thread)
public class JdbcBenchmarks implements PerfBenchmarks {
  
  private Connection connection;

  @Setup
  public void initJdbcConnection() {
    try {
      connection = DriverManager.getConnection(DbDetails.JDBC_URL, DbDetails.JDBC_CONN_PROPS);
    } catch(SQLException e) {}    
  }
  
  @TearDown
  public void tearDown() {
    try {
      connection.close();
    } catch(SQLException e) {}
  }

  @Benchmark
  @Override
  public Set<String> simpleQueryWithWhereAndLimit() {
    Set<String> albumTitles = new HashSet<>();
    
    try (Statement stmt = connection.createStatement(); 
        ResultSet rs = stmt.executeQuery("SELECT Album.Title FROM Album WHERE ArtistId = 150 LIMIT 5")) {
      while(rs.next()) {
        albumTitles.add(rs.getString("Title"));
      }
    } catch(SQLException e) {
      throw new AssertionError(e);
    }
    
    
    return albumTitles;
  }

  @Benchmark
  @Override
  public Map<String, String> queryWithJoinAndGroupBy() {
    Map<String, String> albumTitleTracks = new HashMap<>();
    
    try(Statement stmt = connection.createStatement(); 
        ResultSet rs = stmt.executeQuery("SELECT Album.Title, Track.Name FROM Album JOIN Track ON Track.AlbumId = Album.AlbumId WHERE Album.ArtistId = 11 GROUP BY Album.Title");) {
      while(rs.next()) {
        albumTitleTracks.put(rs.getString("Title"), rs.getString("Name"));
      }
      
    } catch (SQLException e) {
      throw new AssertionError(e);
    }
    
    
    return albumTitleTracks;
  }
}
