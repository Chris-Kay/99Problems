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

    "encode the run length of a list" in {
      listBasedChallenges.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) mustEqual
        List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    }

    "encode modified" in {
      listBasedChallenges.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) mustEqual
        List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    }

    "decode a run length" in {
      listBasedChallenges.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) mustEqual
        List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    }

    "duplicate elements in a list" in {
      listBasedChallenges.duplicate(List('a, 'b, 'c, 'c, 'd)) mustEqual
        List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    }

    "duplicate elements N number of times" in {
      listBasedChallenges.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) mustEqual
        List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    }

    "drop every 3rd number" in {
      listBasedChallenges.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) mustEqual
        List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    }

    "drop every 2nd number" in {
      listBasedChallenges.drop(2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) mustEqual
        List('a, 'c, 'e, 'g, 'i, 'k)
    }

    "split into 2 parts" in {
      listBasedChallenges.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) mustEqual
        (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    }

    "splice list at exact point" in {
      listBasedChallenges.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) mustEqual
        List('d, 'e, 'f, 'g)
    }

    "rotate at N" in {
      listBasedChallenges.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) mustEqual
        List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

      listBasedChallenges.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) mustEqual
        List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)

    }
  }
}
