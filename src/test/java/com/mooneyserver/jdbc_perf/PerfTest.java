package com.mooneyserver.jdbc_perf;

import org.junit.Test;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import com.mooneyserver.jdbc_perf.jdbc.JdbcBenchmarks;
import com.mooneyserver.jdbc_perf.jooq.JooqBenchmarks;
import com.mooneyserver.jdbc_perf.speedment.SpeedmentBenchmarks;

public class PerfTest {

  @Test
  public void performJmhRun() throws Exception {
    Options opt = new OptionsBuilder()
        .include(SpeedmentBenchmarks.class.getSimpleName())
        .include(JdbcBenchmarks.class.getSimpleName())
        .include(JooqBenchmarks.class.getSimpleName())
        .forks(1)
        .build();

    new Runner(opt).run();
  }
}
