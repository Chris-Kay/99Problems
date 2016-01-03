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

    "return the length of the list" in {
      P01.length(List(1, 1, 2, 3, 5, 8)) mustEqual 6
    }

    "reverses the list" in {
      P01.reverse(List(1, 1, 2, 3, 5, 8)) mustEqual List(8, 5, 3, 2, 1, 1)
    }

    "find out if list isPalindrome" in {
      P01.isPalindrome(List(1, 2, 3, 2, 1)) must beTrue
    }
  }
}
