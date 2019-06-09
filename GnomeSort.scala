import scala.language.postfixOps
import java.util.Arrays

object GnomeSorter {

  def gnomeSort(x: Array[Int], n: Int): Unit = {
    var index = 0
    while (index < n) {
      if (index == 0) { index += 1; index - 1 }
      if (x(index) >= x(index - 1)) { index += 1; index - 1 } else {
        var temp = 0
        temp = x(index)
        x(index) = x(index - 1)
        x(index - 1) = temp { index -= 1; index + 1 }
      }
    }
    return
  }

  def main(args: Array[String]): Unit = {
    var ls = Array(10, 3, 4, 54, 67, 100, 123)
    gnomeSort(ls, ls.length)
    println(ls.mkString(" "))
  }

}
