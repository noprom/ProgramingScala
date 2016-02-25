package programingscala.functionalprograming.basics

/**
  * HofsClosure3
  *
  * @author tyee.noprom@qq.com
  * @time 2/25/16 4:22 PM.
  */
object HofsClosure3 {

  def main(args: Array[String]) {
    object Multiplier {
      var factor = 2
      // Compare:
      val multiplier = (i: Int) => i * factor

      def multiplier(i: Int) = i * factor
    }
    (1 to 10) filter (_ % 2 == 0) map Multiplier.multiplier reduce (_ * _)
    Multiplier.factor = 3
    (1 to 10) filter (_ % 2 == 0) map Multiplier.multiplier reduce (_ * _)
  }
}
