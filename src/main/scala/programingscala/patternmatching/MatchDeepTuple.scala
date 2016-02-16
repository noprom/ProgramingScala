package programingscala.patternmatching

/**
 * MatchDeepTuple
 *
 * @author tyee.noprom@qq.com
 * @time 2/16/16 4:55 PM.
 */
object MatchDeepTuple {

  /**
   * Extract the index with zipWithIndex
   * from the sequence
   *
   * @param args
   */
  def main(args: Array[String]) {
    val itemsCosts = Seq(("Pencil", 0.52), ("Paper", 1.35), ("Notebook", 2.43))
    val itemsCostsIndices = itemsCosts.zipWithIndex
    for (itemCostIndex <- itemsCostsIndices) {
      itemCostIndex match {
        case ((item, cost), index) => println(s"$index: $item costs $cost each")
      }
    }
  }
}

/**
 * 0: Pencil costs 0.52 each
 * 1: Paper costs 1.35 each
 * 2: Notebook costs 2.43 each
 */
