package ScalaProblems
import org.specs2.mutable.Specification

class problem1 extends Specification {

  "The Score" should {
    "return last element" in {

      listBasedChallenges.lastBuiltin(List(1, 1, 2, 3, 5, 8)) mustEqual 8
     }

    "return last but one" in {

     listBasedChallenges.penultimate(List(1, 1, 2, 3, 5, 8)) mustEqual 5
    }

    "return nth charecter" in {
      listBasedChallenges.nth(2, List(1, 1, 2, 3, 5, 8)) mustEqual 2
    }

    "return the length of the list" in {
      listBasedChallenges.length(List(1, 1, 2, 3, 5, 8)) mustEqual 6
    }

    "reverses the list" in {
      listBasedChallenges.reverse(List(1, 1, 2, 3, 5, 8)) mustEqual List(8, 5, 3, 2, 1, 1)
    }

    "find out if list isPalindrome" in {
      listBasedChallenges.isPalindrome(List(1, 2, 3, 2, 1)) must beTrue
    }

    "flatter a nested list structure" in {
      listBasedChallenges.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) mustEqual List(1, 1, 2, 3, 5, 8)
    }

    "repeated elements into nested list" in {
      listBasedChallenges.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) mustEqual
        List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    }

    "Elimimate consecutive duplicates in a list" in {
      listBasedChallenges.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) mustEqual
        List('a, 'b, 'c, 'a, 'd, 'e)
    }
  }
}
