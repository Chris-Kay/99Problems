package ScalaProblems
import org.specs2.mutable.Specification

/**
 * Created by Chris on 03/01/2016.
 */
class problem1 extends Specification {

  "The Score" should {
    "return last element" in {

      P01.lastBuiltin(List(1, 1, 2, 3, 5, 8)) mustEqual 8
     }

    "return last but one" in {

     P01.penultimate(List(1, 1, 2, 3, 5, 8)) mustEqual 5
    }
  }
}
