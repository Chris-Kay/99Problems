package ScalaProblems

// P01 (*) Find the last element of a list.
//     Example:
//     scala> last(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 8

// The start of the definition of last should be
//     def last[A](l: List[A]): A = ...
// The `[A]` allows us to handle lists of any type.

object listBasedChallenges {
  // There are several ways to solve this problem.  If we use builtins, it's very
  // easy.
  def lastBuiltin[A](ls: List[A]): A = ls.last

  //  def penultimate[A](ls: List[A]): A = ls.slice(1,ls.size - 1).last
  def penultimate[A](ls: List[A]): A = ls.init.last

  def nth[A](nth: Int, ls: List[A]): Any = {
    if (nth >= 0) ls(nth)
    else throw new NoSuchElementException
  }

  def length[A](ls: List[A]): Int = ls.length

  def reverse[A](ls: List[A]): List[A] = ls.reverse

  def isPalindrome[A](ls: List[A]): Boolean = ls.reverse == ls

  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case list: List[_] => flatten(list)
    case i: Int => List(i)
  }

  def pack[A](ls: List[A]): List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = ls span {
        _ == ls.head
      }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }

  def compress[A](ls: List[A]): List[A] = ls match {
    case Nil => Nil
    case h :: tail => h :: compress(tail.dropWhile(_ == h))
  }

  def encode[A](ls: List[A]): List[Any] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = ls span {
        _ == ls.head
      }

      if (next == Nil) List((packed.size, packed.head))
      else (packed.size, packed.head) :: encode(next)
    }
  }
}
