import scala.language.postfixOps

object SelectionSorter {

  def selectionSort(x: Array[Int]): Array[Int] = {
    for (i <- 0 until x.length) {
      var minPos = i

      for (j <- i + 1 until x.length)
        if (x(j) < x(minPos))
          minPos = j

      if (minPos != i) {
        val temp = x(i)
        x(i) = x(minPos)
        x(minPos) = x(i)
      }
    }

    x
  }

  def main(args: Array[String]): Unit = {
    var ls = Array(10, 3, 4, 54, 67, 100, 123)
    val sorted = selectionSort(ls)
    println(sorted.mkString(" "))
  }

}
