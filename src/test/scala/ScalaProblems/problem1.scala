package ScalaProblems
import org.specs2.mutable.Specification

class problem1 extends Specification {

  "The Score" should {
    "return last element" in {

      P01.lastBuiltin(List(1, 1, 2, 3, 5, 8)) mustEqual 8
     }

    "return last but one" in {

     P01.penultimate(List(1, 1, 2, 3, 5, 8)) mustEqual 5
    }

    "return nth charecter" in {
      P01.nth(2, List(1, 1, 2, 3, 5, 8)) mustEqual 2
    }
  }
}
