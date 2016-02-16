package programingscala.patternmatching

/**
 * MatchReverseSeq
 *
 * @author tyee.noprom@qq.com
 * @time 2/16/16 6:39 PM.
 */
object MatchReverseSeq {

  /**
   * reverse iteration
   * For List, the :+ method for appending elements and the :+ object for <br/>
   * pattern matching both require O(n) time, because they have to traverse <br/>
   * the list from the head. However, some other sequences, such as Vector, are O(1).
   *
   * @param args args
   */
  def main(args: Array[String]) {
    val nonEmptyList = List(1, 2, 3, 4, 5)
    val nonEmptyVector = Vector(1, 2, 3, 4, 5)
    val nonEmptyMap = Map("one" -> 1, "two" -> 2, "three" -> 3)

    def reverseSeqToString[T](l: Seq[T]): String = l match {
      case prefix :+ end => reverseSeqToString(prefix) + s" :+ $end"
      case Nil => "Nil"
    }

    for (seq <- Seq(nonEmptyList, nonEmptyVector, nonEmptyMap.toSeq)) {
      println(reverseSeqToString(seq))
    }
  }
}

/**
 * Nil :+ 1 :+ 2 :+ 3 :+ 4 :+ 5
 * Nil :+ 1 :+ 2 :+ 3 :+ 4 :+ 5
 * Nil :+ (one,1) :+ (two,2) :+ (three,3)
 */