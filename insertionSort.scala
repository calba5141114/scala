import scala.language.postfixOps

object InsertionSorter {

  def insertionSort(x: Array[Int]): Array[Int] = {

    for (i <- 0 until x.length) {

      val hold = x(i)
      var holePos = i

      while (holePos > 0 && hold < x(holePos - 1)) {
        x(holePos) = x(holePos - 1)
        holePos -= 1
      }

      x(holePos) = hold
    }

    x
  }

  def main(args: Array[String]): Unit = {
    var ls = Array(10, 3, 4, 54, 67, 100, 123)
    val sorted = insertionSort(ls)
    println(sorted.mkString(" "))
  }

}
