package programingscala.functionalprograming.basics

/**
  * HofsClosure
  *
  * @author tyee.noprom@qq.com
  * @time 2/25/16 1:58 PM.
  */
object HofsClosure2 {

  def main(args: Array[String]) {
    var factor = 2
    val multiplier = (i: Int) => i * factor

    def m1(multiplier: Int => Int) = {
      (1 to 10) filter (_ % 2 == 0) map multiplier reduce ((x: Int, y: Int) => {
        println(x, y)
        x * y
      })
    }

    def m2: Int => Int = {
      val factor = 2
      val multiplier = (i: Int) => i * factor
      multiplier
    }
    m1(m2)
  }
}