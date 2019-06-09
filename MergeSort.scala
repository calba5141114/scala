import scala.language.postfixOps

object MergeSorter {

  def mergeSort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[Int], ys: List[Int]): List[Int] =
        (xs, ys) match {
          case (Nil, ys) => ys
          case (xs, Nil) => xs
          case (x :: xs1, y :: ys1) =>
            if (x < y) x :: merge(xs1, ys)
            else y :: merge(xs, ys1)
        }
      val (left, right) = xs splitAt (n)
      merge(mergeSort(left), mergeSort(right))
    }
  }

  def main(args: Array[String]): Unit = {
    var ls = List(10, 3, 4, 54, 67, 100, 123)
    val sorted = mergeSort(ls)
    println(sorted.mkString(" "))
  }

}
