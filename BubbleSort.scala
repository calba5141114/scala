import scala.language.postfixOps

object BubbleSorter {

  def bubbleSort(x: Array[Int]): Array[Int] = {
    var didSwap = false

    for (i <- 0 until x.length - 1)
      if (x(i + 1) < x(i)) {
        val temp = x(i)
        x(i) = x(i + 1)
        x(i + 1) = temp
        didSwap = true
      }

    if (didSwap)
      bubbleSort(x)
    else
      x
  }

  def main(args: Array[String]): Unit = {
    var ls = Array(10, 3, 4, 54, 67, 100, 123)
    val sorted = bubbleSort(ls)
    println(sorted.mkString(" "))
  }

}
