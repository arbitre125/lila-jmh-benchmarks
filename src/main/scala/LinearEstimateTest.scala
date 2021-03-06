package org.openjdk.jmh.samples

import org.openjdk.jmh.annotations._

import java.util.concurrent.TimeUnit

import org.lila.clockencoder.LinearEstimator

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class LinearEstimateTest extends EncodingTestData {

  @Benchmark
  def testEncode = LinearEstimator.encode(trunced, startTime)
}
