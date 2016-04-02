package programingscala.traits.ui

/**
  * ButtonCallbacks
  *
  * Author: Noprom <tyee.noprom@qq.com>
  * Date: 4/2/16 9:27 AM.
  */
abstract class Widget

class ButtonWithCallbacks(val label: String,
                          val callbacks: List[() => Unit] = Nil) extends Widget {
  def click(): Unit = {
    updateUI()
    callbacks.foreach(f => f())
  }

  protected def updateUI(): Unit = {
    /* logic to change GUI appearance */
  }
}

object ButtonWithCallbacks {
  def apply(label: String, callback: () => Unit) =
    new ButtonWithCallbacks(label, List(callback))

  def apply(label: String) =
    new ButtonWithCallbacks(label, Nil)
}


class ButtonCallbacks {

}
