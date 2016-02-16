package programingscala.patternmatching

/**
 * MatchSeqParens
 *
 * @author tyee.noprom@qq.com
 * @time 2/16/16 4:02 PM.
 */
object MatchSeqParens {

  def main(args: Array[String]) {
    val nonEmptySeq = Seq(1, 2, 3, 4, 5)
    val emptySeq = Seq.empty[Int]
    val nonEmptyMap = Map("one" -> 1, "two" -> 2, "three" -> 3)

    def seqToString[T](seq: Seq[T]): String = seq match {
      case head +: tail => s"$head +: ${seqToString(tail)}"
      case Nil => "(Nil)"
    }

    for (seq <- Seq(nonEmptySeq, emptySeq, nonEmptyMap.toSeq)) {
      println(seqToString(seq))
    }
  }
}

/**
 *   (1 +: (2 +: (3 +: (4 +: (5 +: (Nil))))))
    (Nil)
    ((one,1) +: ((two,2) +: ((three,3) +: (Nil))))
 */
