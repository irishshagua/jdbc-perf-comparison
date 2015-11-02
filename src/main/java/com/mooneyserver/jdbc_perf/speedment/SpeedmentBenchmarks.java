package com.mooneyserver.jdbc_perf.speedment;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import com.mooneyserver.jdbc_perf.DbDetails;
import com.mooneyserver.jdbc_perf.PerfBenchmarks;
import com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.PerfTestChinookSchemaApplication;
import com.mooneyserver.jdbc_perf.speedment.generated.perfTestChinookSchema.perfTestChinookSchema.perfTestChinookSchema.Album.Album;
import com.speedment.Manager;

@State(Scope.Thread)
public class SpeedmentBenchmarks implements PerfBenchmarks {
  
  private Manager<Album> albums;
  
  @Setup
  public void initSpeedmentApplicationClass() {
    albums = new PerfTestChinookSchemaApplication()
      .withPassword("password")
      .build()
      .managerOf(Album.class);
  }
  
  @Benchmark
  @Override
  public Set<String> simpleQueryWithWhereAndLimit() {
    return albums.stream()
        .filter(a -> a.getArtistId().equals(DbDetails.U2_ARTIST_ID))
        .limit(DbDetails.FILTERED_ALBUM_QUERY_LIMIT_SIZE)
        .map(a -> a.getTitle())
        .collect(Collectors.toSet());
  }
  
  @Benchmark
  @Override
  public Map<String, String> queryWithJoinAndGroupBy() {
    return albums.stream()
      .filter(a -> a.getArtistId().equals(DbDetails.BLS_ARTIST_ID))
      .map(a -> a.findTracks().findFirst().get())
      .collect(Collectors.toMap(t -> t.findAlbumId().get().getTitle(), t -> t.getName()));
  }
}
