package programingscala.functionalprograming.basics

/**
  * HofsExample
  *
  * @author tyee.noprom@qq.com
  * @time 2/25/16 1:45 PM.
  */
object HofsExample {

  def main(args: Array[String]) {
    (1 to 10) filter (_ % 2 == 0) map (_ * 2) reduce (_ * _)
  }
}
