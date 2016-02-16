package programingscala.patternmatching

/**
 * MatchVariable
 * @author tyee.noprom@qq.com
 * @time 2/16/16 11:09 AM.
 */
object MatchVariable {

  def main(args: Array[String]) {
    for {
      x <- Seq(1, 2, 2.7, "one", "two", 'four)
    } {
      val str = x match {
        case 1            => "int 1"
        case i: Int       => "other int: " + i
        case d: Double    => "a double: " + x
        case "one"        => "string one"
        case s: String    => "other string: " + s
        case unexpected   => "unexpected value: " + unexpected
      }
      println(str)
    }
  }
}
