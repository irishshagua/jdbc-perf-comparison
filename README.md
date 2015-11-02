# jdbc-perf-comparison
Compare performance of a few different SQL frameworks in JAVA

Benchmark  | Score | Units
------------- | ---- | ---------
JdbcBenchmarks.queryWithJoinAndGroupBy  | 24893.414 | ops/s
JdbcBenchmarks.simpleQueryWithWhereAndLimit  | 28356.662 | ops/s
JooqBenchmarks.queryWithJoinAndGroupBy | 9624.699 | ops/s
JooqBenchmarks.simpleQueryWithWhereAndLimit | 11597.112 | ops/s
SpeedmentBenchmarks.queryWithJoinAndGroupBy | 905.404 | ops/s
SpeedmentBenchmarks.simpleQueryWithWhereAndLimit | 3507.099 | ops/s

