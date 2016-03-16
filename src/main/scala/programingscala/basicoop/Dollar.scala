package programingscala.basicoop

/**
  * Value Classes
  *
  * Author: Noprom <tyee.noprom@qq.com>
  * Date: 16/3/16 下午1:31.
  */
class Dollar(val value: Float) extends AnyVal {
  override def toString = "$%.2f".format(value)
}

object Dollar {
  def main(args: Array[String]) {
    val benjamin = new Dollar(100)
    println(benjamin)
  }
}
