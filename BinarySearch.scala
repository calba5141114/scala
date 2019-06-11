object BinarySearcher {

  def binarySearch(a: Array[Int], value: Int): Int = {

    var start = 0
    var end = a.length
    var mid = (end + start) / 2

    while (end > start && a(mid) != value) {
      if (value < a(mid)) {
        end = mid
      } else {
        start = mid + 1
      }
      mid = (start + end) / 2
    }
    if (end > start) mid else -1
  }

}
