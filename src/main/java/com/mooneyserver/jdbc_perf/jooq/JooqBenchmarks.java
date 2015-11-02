package com.mooneyserver.jdbc_perf.jooq;

import static com.mooneyserver.jdbc_perf.jooq.generated.tables.Album.ALBUM;
import static com.mooneyserver.jdbc_perf.jooq.generated.tables.Track.TRACK;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import com.mooneyserver.jdbc_perf.DbDetails;
import com.mooneyserver.jdbc_perf.PerfBenchmarks;

@State(Scope.Thread)
public class JooqBenchmarks implements PerfBenchmarks {
  
  private DSLContext jooq;
  
  @Setup
  public void initJooqDslContext() {
    try {
      jooq = DSL.using(
          DriverManager.getConnection(DbDetails.JDBC_URL, DbDetails.JDBC_CONN_PROPS), 
          SQLDialect.MARIADB);
    } catch(SQLException e) {}
  }
  
  @Benchmark
  @Override
  public Map<String, String> queryWithJoinAndGroupBy() {
    Result<Record2<String, String>> albumTitleTracks = 
        jooq.select(ALBUM.TITLE, TRACK.NAME)
          .from(ALBUM)
          .join(TRACK).on(TRACK.ALBUMID.eq(ALBUM.ALBUMID))
          .where(ALBUM.ARTISTID.eq(DbDetails.BLS_ARTIST_ID))
          .groupBy(ALBUM.TITLE)
          .fetch();
    
    return albumTitleTracks.stream()
        .collect(Collectors.toMap(
            r -> r.getValue(ALBUM.TITLE), 
            r -> r.getValue(TRACK.NAME)));
  }
  
  @Benchmark
  @Override
  public Set<String> simpleQueryWithWhereAndLimit() {
    Result<Record1<String>> albumTitles = 
        jooq.select(ALBUM.TITLE)
          .from(ALBUM)
          .where(ALBUM.ARTISTID.eq(DbDetails.U2_ARTIST_ID))
          .limit(DbDetails.FILTERED_ALBUM_QUERY_LIMIT_SIZE)
          .fetch();
    
    return albumTitles.stream()
        .map(r -> r.getValue(ALBUM.TITLE))
        .collect(Collectors.toSet());
  }
}
