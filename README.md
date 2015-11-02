# jdbc-perf-comparison
Compare performance of a few different SQL frameworks in JAVA

Benchmark                                                          Mode  Cnt      Score      Error  Units
c.m.j.jdbc.JdbcBenchmarks.queryWithJoinAndGroupBy                 thrpt   20  24893.414 ± 1584.248  ops/s
c.m.j.jdbc.JdbcBenchmarks.simpleQueryWithWhereAndLimit            thrpt   20  28356.662 ± 1094.394  ops/s
c.m.j.jooq.JooqBenchmarks.queryWithJoinAndGroupBy                 thrpt   20   9624.699 ±  473.367  ops/s
c.m.j.jooq.JooqBenchmarks.simpleQueryWithWhereAndLimit            thrpt   20  11597.112 ±  619.879  ops/s
c.m.j.speedment.SpeedmentBenchmarks.queryWithJoinAndGroupBy       thrpt   20    905.404 ±   39.647  ops/s
c.m.j.speedment.SpeedmentBenchmarks.simpleQueryWithWhereAndLimit  thrpt   20   3507.099 ±  319.049  ops/s

