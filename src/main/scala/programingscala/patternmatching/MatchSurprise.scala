package programingscala.patternmatching

/**
 * MatchSurprise
 *
 * @author tyee.noprom@qq.com
 * @time 2/16/16 12:48 PM.
 */
object MatchSurprise {


  /**
   * The compiler assumes that a term that starts with a capital letter is a type name, <br/>
   * while a term that begins with a lowercase letter is assumed to be the name of a variable<br/>
   * that will hold an extracted or matched value.
   *
   * @param args args
   */
  def main(args: Array[String]) {
    checkY(100)
  }

  /**
   * y must be 'y'
   * In case clauses, a term that begins with a lowercase letter is as‐ sumed to be the  <br/>
   * name of a new variable that will hold an extracted value. To refer to a previously  <br/>
   * defined variable, enclose it in back ticks. Conversely, a term that begins with an  <br/>
   * uppercase letter is as‐ sumed to be a type name.
   *
   * @param y param
   */
  def checkY(y: Int) = {
    for {
      x <- Seq(99, 100, 101)
    } {
      val str = x match {
        case 'y' => "found y!"      // The only change: `y`
        case i: Int => "int: " + i
      }
      println(str)
    }
  }
}

/**
 *  <console>:12: warning: patterns after a variable pattern cannot match (SLS 8.1.1)
    If you intended to match against parameter y of method checkY, you must use
    backticks, like: case `y` =>
                 case y => "found y!"
                      ^
    <console>:13: warning: unreachable code due to variable pattern 'y' on line 12
                 case i: Int => "int: "+i
                                       ^
    <console>:13: warning: unreachable code
                 case i: Int => "int: "+i
                                       ^
    checkY: (y: Int)Unit
    found y!
    found y!
    found y!
 */
