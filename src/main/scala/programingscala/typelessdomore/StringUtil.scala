package programingscala.typelessdomore

/**
 * Created by noprom on 1/19/16.
 */
object StringUtil {
  def joiner(strings: String*): String = {
    strings.mkString("-")
  }

  def joiner(strings: List[String]): String = {
    /**
     * The way I read this curious expression, strings :_*,
     * is to think of it as a hint to the compiler that you
     * want the list strings to be treated as a variable
     * argument list (“*”) of some unspecified, but inferred
     * type (“:_”). Scala doesn’t let you write strings :String*,
     * even though that’s the actual type we need for the other
     * joiner method.
     */
    joiner(strings :_*)
  }

  def main (args: Array[String]) {
    println( StringUtil.joiner(List("Programming", "Scala")) )
  }
}


