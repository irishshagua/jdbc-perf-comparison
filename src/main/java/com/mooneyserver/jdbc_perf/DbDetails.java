package com.mooneyserver.jdbc_perf;

import java.util.Properties;

public final class DbDetails {
  
  private DbDetails() {}
  
  // DB Details
  public static final String JDBC_URL = "jdbc:mysql://localhost:3306/perfTestChinookSchema";
  public static final Properties JDBC_CONN_PROPS = new Properties();
  
  static {
    JDBC_CONN_PROPS.put("user", "root");
    JDBC_CONN_PROPS.put("password", "password");
  }
  
  // Query Helpers
  public static final Integer FILTERED_ALBUM_QUERY_LIMIT_SIZE = new Integer(5);
  
  // Artist Identifiers
  public static final Integer U2_ARTIST_ID = new Integer(150);
  public static final Integer BLS_ARTIST_ID = new Integer(11);
  
}
