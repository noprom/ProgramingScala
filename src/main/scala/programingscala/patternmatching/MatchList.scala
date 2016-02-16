package programingscala.patternmatching

/**
 * MatchList
 *
 * @author tyee.noprom@qq.com
 * @time 2/16/16 4:10 PM.
 */
object MatchList {

  def main(args: Array[String]) {
    val nonEmptyList = List(1, 2, 3, 4, 5)
    val emptyList = Nil

    def listToString[T](list: List[T]): String = {
      list match {
        case head :: tail => s"$head :: ${listToString(tail)}"
        case Nil => "(Nil)"
      }
    }

    for (l <- List(nonEmptyList, emptyList)) {
      println(listToString(l))
    }
  }
}

/**
 * 1 :: 2 :: 3 :: 4 :: 5 :: (Nil)
 * (Nil)
 */