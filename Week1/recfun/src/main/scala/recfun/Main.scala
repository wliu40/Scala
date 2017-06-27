package recfun
import common._
import scala.collection.immutable.Stack

object Main{
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
      if (c==0 || c ==r) 1
      else pascal(c-1,r-1)+pascal(c,r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def helper(chars:List[Char], mylist: List[Char]):Boolean =
        if (chars.isEmpty) mylist.isEmpty
        else{
          chars.head match {
            case '(' => helper(chars.tail, List('('):::mylist)
            case ')' => if (mylist.contains( '(' ) ) helper(chars.tail, mylist.tail)
            else false
            case _ => helper(chars.tail, mylist)
          }
        }
      val mylist = List()
      helper(chars, mylist)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      money match {
        case 0 => 1
        case x if x > 0 && coins.isEmpty => 0
        case x if x < 0 => 0
        case _ => countChange(money - coins.head, coins) + countChange(money, coins.tail)
      }
    }

}

