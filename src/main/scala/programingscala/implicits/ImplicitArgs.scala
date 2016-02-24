package programingscala.implicits

/**
  * ImplicitArgs
  *
  * @author tyee.noprom@qq.com
  * @time 2/24/16 9:08 AM.
  */
object ImplicitArgs {

  def main(args: Array[String]) {
    {
      import SimpleStateSalesTax.rate
      implicit val myStore = ComplicatedSalesTaxData(0.06F, false, 1010)

      val amount = 100F
      println(s"Tax on $amount = ${calcTax(amount)}")
    }
  }

  // Never use Floats for money:
  def calcTax(amount: Float)(implicit rate: Float): Float = amount * rate

  object SimpleStateSalesTax {
    implicit val rate: Float = 0.05F
  }

  case class ComplicatedSalesTaxData(baseRate: Float, isTaxHoliday: Boolean, storeId: Int)

  object ComplicatedSalesTax {
    private def extraTaxRateForStore(id: Int): Float = {
      // From id, determine location, then extra taxes...
      0.0F
    }

    implicit def date(implicit cstd: ComplicatedSalesTaxData): Float =
      if (cstd.isTaxHoliday) 0.0F
      else cstd.baseRate + extraTaxRateForStore(cstd.storeId)
  }w
}

