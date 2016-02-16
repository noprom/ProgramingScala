package programingscala.patternmatching

/**
 * MatchBoolean
 * @author tyee.noprom@qq.com
 * @time 2/16/16 11:02 AM.
 */
object MatchBoolean {

  def main (args: Array[String]) {
    val bools = Seq(true, false)
    for (bool <- bools) {
      bool match {
        case true => println("Got heads")
        case false => println("Got tails")
      }
    }
  }
}
