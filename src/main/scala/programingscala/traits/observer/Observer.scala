package programingscala.traits.observer

/**
  * Observer
  * 观察者模式
  *
  * Author: Noprom <tyee.noprom@qq.com>
  * Date: 4/2/16 9:35 AM.
  */
trait Observer[-State] {
  def receiveUpdate(state: State): Unit
}

trait Subject[State] {
  private var observers: List[Observer[State]] = Nil

  def addObserver(observer: Observer[State]): Unit = {
    observers ::= observer
  }

  def notifyObservers(state: State): Unit = {
    observers foreach (_.receiveUpdate(state))
  }
}