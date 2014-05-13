package recfun
import common._
import scala.collection.mutable.Stack

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    def factorial(num: Int) : Int = {
      if(num == 0) 1 else num * factorial(num - 1)
    }

    factorial(r) / (factorial(c) * factorial(r - c))
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    val stack = new Stack[Char]

    def isBalanced(chars: List[Char]) : Unit = {
      if(chars.isEmpty) return
      
      chars.head match {
        case x if (x == '(' || x == ')') && stack.isEmpty => stack.push(chars.head)
        case x if x == '(' => stack.push(chars.head)
        case x if x == ')' && stackTop == '(' => stack.pop
        case _ => 
      }
      
      isBalanced(chars.tail)
    }

    def stackTop(): Char = {
      if (stack.isEmpty) '\0' else stack.top
    }

    isBalanced(chars)

    stack.length == 0
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money <= 0) return 0
    if (coins.isEmpty) return 0

    0
  }
}
