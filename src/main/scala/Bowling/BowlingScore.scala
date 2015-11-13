package Bowling

class BowlingGame(Player1: Player, player2: Player) {

}

class Player(name: String) {
  var scoreCard = List[Int]()
  var numberOfStrikes = 0
  var score = 0
  var strike = 0
  var tempScore = 0

  def bowl(firstBowl: Int, secondBowl: Int): Unit = {

    if(firstBowl == 10) {
      handleStrike(firstBowl)
    } else if (firstBowl + secondBowl == 10) {
      scoreCard = scoreCard :+ 0
    } else {
      scoreCard = scoreCard :+ (firstBowl + secondBowl)
    }
  }
  def getScore() = {
    scoreCard.foreach( score += _)
    score = score + tempScore
    score
  }

  def handleStrike(firstBowl: Int): Unit = {
    if (strike == 0) {
      strike += 1
      tempScore = 10
    } else if (strike == 2) {
      tempScore = tempScore + firstBowl
    } else {
      scoreCard = scoreCard :+ 10 + tempScore
      tempScore = 0
      strike += 1
    }
  }

}

object Player {
  def apply(name: String) = {new Player(name)}
}