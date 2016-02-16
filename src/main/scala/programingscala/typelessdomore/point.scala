package programingscala.typelessdomore

/**
 * Created by noprom on 1/16/16.
 */
case class point (x: Double = 0.0, y: Double = 0.0){
  def shift(deltax: Double = 0.0, deltay: Double = 0.0) = {
    copy(x + deltax, y + deltay)
  }

  val p1 = new point(1.2, 3.0)
  val p2 = p1.copy(y = 1.1)
}
