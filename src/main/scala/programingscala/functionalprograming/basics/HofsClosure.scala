package programingscala.functionalprograming.basics

/**
  * HofsClosure
  *
  * @author tyee.noprom@qq.com
  * @time 2/25/16 1:58 PM.
  */
object HofsClosure {

  def main(args: Array[String]) {
    var factor = 2
    val multiply = (x: Int, y: Int) => {
      println(x, y)
      x * y
    }
    val multiplier = (i: Int) => i * factor
    (1 to 10) filter (_ % 2 == 0) map multiplier reduce (multiply)

    factor = 3
    (1 to 10) filter (_ % 2 == 0) map multiplier reduce (multiply)
  }
}