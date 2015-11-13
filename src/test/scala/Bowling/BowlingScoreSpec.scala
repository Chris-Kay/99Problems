package Bowling

import org.specs2.mutable.Specification
import org.specs2.specification.Before

class BowlingScoreSpec extends Specification with Before {


  sequential

  "The Score" should {
    "return the correct score for 2 bowls" in {
      val chris = new Player("Chris")
      val jim = new Player("Jim")
      val game = new BowlingGame(chris, jim)

      chris.bowl(2, 6)
      chris.getScore must beEqualTo(8)
    }

    "one strike prior shoud allow 10 to be added" in {
      val chris = new Player("Chris")
      val jim = new Player("Jim")
      val game = new BowlingGame(chris, jim)

      chris.bowl(10, 0)
      chris.bowl(1, 0)
      chris.getScore must beEqualTo(11)
    }

    "two strike prior shoud allow 20 to be added" in {
      val chris = new Player("Chris")
      val jim = new Player("Jim")
      val game = new BowlingGame(chris, jim)

      chris.bowl(10, 0)
      chris.bowl(10, 0)
      chris.bowl(4, 2)
      chris.getScore must beEqualTo(26)
    }
  }

  override def before: Any = {

  }
}