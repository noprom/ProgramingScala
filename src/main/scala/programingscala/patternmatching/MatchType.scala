package programingscala.patternmatching

/**
 * MatchType
 *
 * @author tyee.noprom@qq.com
 * @time 2/23/16 5:52 AM.
 */
object MatchType {

  def main(args: Array[String]) {
    for {
      x <- Seq(List(5.5, 5.6, 5.7), List("a", "b"), Nil)
    } yield {
      x match {
        case seq: Seq[_] => (s"seq ${doSeqMatch(seq)}", seq)
        case _ => ("unknown!", x)
      }
    }
  }

  def doSeqMatch[T](seq: Seq[T]): String = seq match {
    case Nil => "Nothing"
    case head +: _ => head match {
      case _: Double => "Double"
      case _: String => "String"
      case _ => "Unmatched seq element"
    }
  }
}
