package programingscala.patternmatching

/**
 * MatchGuard
 *
 * @author tyee.noprom@qq.com
 * @time 2/16/16 4:27 PM.
 */
object MatchGuard {

  def main(args: Array[String]) {
    for (i <- Seq(1, 2, 3, 4)) {
      i match {
        case _ if i % 2 == 0 => println(s"even: $i")
        case _ => println(s"odd: $i")
      }
    }
  }
}
