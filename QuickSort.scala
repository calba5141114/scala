import scala.language.postfixOps

object Sorter {

  def sort(xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) xs
    else {

      val pivot = xs(xs.length / 2)
      Array.concat(sort(xs filter (pivot >)),
                   xs filter (pivot ==),
                   sort(xs filter (pivot <)))
    }
  }

  def main(args: Array[String]): Unit = {
    var ls = Array(10, 3, 4, 54, 67, 100, 123)
    val sorted = sort(ls)
    println(sorted.mkString(" "))
  }

}
