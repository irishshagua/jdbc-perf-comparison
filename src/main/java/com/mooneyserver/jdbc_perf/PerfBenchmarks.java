package com.mooneyserver.jdbc_perf;

import java.util.Map;
import java.util.Set;

public interface PerfBenchmarks {
  
  /**
   * Return the first 8 Albums By U2
   * 
   * Query:
   * 
   * SELECT * 
   * FROM 
   *  Album 
   * WHERE 
   *  ArtistId = 150 
   * LIMIT 5;
   * 
   * 
   * Expected Return Value:
   * ['Achtung Baby', 'All That You Ca't Leave Behind', 'B-Sides 1980-1990', 'How To Dismantle An Atomic Bomb', 'Pop']
   */
  Set<String> simpleQueryWithWhereAndLimit();
  
  /**
   * Return the first track for each BLS album
   * 
   * Query:
   * 
   * SELECT 
   *  Album.Title, Track.Name
   * FROM
   *  Album
   * JOIN
   *  Track
   * ON
   *  Track.AlbumId = Album.AlbumId
   * WHERE
   *  Album.ArtistId = 11
   * GROUP BY
   *  Album.Title;
   *  
   *  Expected Return Value:
   *  ['Alcohol Fueled Brewtality Live! [Disc 1]':'Intro/ Low Dow', 'Alcohol Fueled Brewtality Live! [Disc 2]':'Heart Of Gold']
   */
  Map<String, String> queryWithJoinAndGroupBy();
}
