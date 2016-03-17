package programingscala.basicoop

/**
  * trait 相当于java里面的接口
  *
  * Author: Noprom <tyee.noprom@qq.com>
  * Date: 16/3/16 下午1:49.
  */
trait Digitizer extends Any {
  def digits(s: String): String = s.replaceAll("""\D""", "") // 数字化
}

trait Formatter extends Any {
  // 格式化
  def format(areaCode: String, exchange: String, subnumber: String): String =
    s"($areaCode) $exchange-$subnumber"
}

class USPhoneNumber2(val s: String) extends AnyVal with Digitizer with Formatter {
  override def toString = {
    val digs = digits(s)
    val areaCode = digs.substring(0, 3)
    val exchange = digs.substring(3, 6)
    val subnumber = digs.substring(6, 10)
    format(areaCode, exchange, subnumber) //
  }
}

object ValueClassUniversalTraits {
  def main(args: Array[String]) {
    val number = new USPhoneNumber2("987-654-3210")
    println(number)
    // Result: number: USPhoneNumber = (987) 654-3210
  }
}
