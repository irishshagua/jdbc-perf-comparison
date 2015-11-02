package com.mooneyserver.jdbc_perf.speedment;

import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mooneyserver.jdbc_perf.DbDetails;

public class SpeedmentBenchmarksTest {
  
  private SpeedmentBenchmarks sb;
  
  @Before
  public void setUpSpeedmentConnection() {
    sb = new SpeedmentBenchmarks();
    sb.initSpeedmentApplicationClass();
  }
  
  @Test
  public void simpleQueryWithWhereAndLimit() {
    Set<String> albums = sb.simpleQueryWithWhereAndLimit();
    
    Assert.assertEquals(DbDetails.FILTERED_ALBUM_QUERY_LIMIT_SIZE.intValue(),  albums.size());
    Assert.assertTrue(albums.contains("Achtung Baby"));
  }
  
  @Test
  public void queryWithJoinAndGroupBy() {
    Map<String, String> albumTracks = sb.queryWithJoinAndGroupBy();
    
    Assert.assertEquals(2, albumTracks.size());
    Assert.assertEquals("Intro/ Low Dow", albumTracks.get("Alcohol Fueled Brewtality Live! [Disc 1]"));
    Assert.assertEquals("Heart Of Gold", albumTracks.get("Alcohol Fueled Brewtality Live! [Disc 2]"));
  }
}
