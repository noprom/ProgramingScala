package programingscala.patternmatching

/**
 * MatchTuple
 *
 * @author tyee.noprom@qq.com
 * @time 2/16/16 4:18 PM.
 */
object MatchTuple {

  def main(args: Array[String]) {
    val langs = Seq(
      ("Scala", "Martin","Odersky"),
      ("Clojure","Rich", "Hickey"),
      ("Lisp", "John", "McCarthy")
    )

    for (tuple <- langs) {
      tuple match {
        case ("Scala", _, _) => println("Found Scala")
        case (lang, first, last) => println(s"Found other language: $lang ($first, $lang)")
      }
    }
  }
}

/**
 * Found Scala
 * Found other language: Clojure (Rich, Clojure)
 * Found other language: Lisp (John, Lisp)
 */