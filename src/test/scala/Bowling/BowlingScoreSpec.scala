package Bowling

import org.specs2.mutable.Specification

class BowlingScoreSpec extends Specification {
  "The Score" should {
    "return 10" in {
      BowlingScore.getScore(10) must beEqualTo (10)
    }
  }
}