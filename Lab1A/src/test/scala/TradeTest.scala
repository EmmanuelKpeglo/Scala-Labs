
import org.scalatest.funsuite.AnyFunSuite

object Scalatest
class TradeTest extends AnyFunSuite {

  val trade : Trade = new Trade("T1", "GP", 5, 9.0)

//  case class
  val trade1: Trade = Trade("T1", "Case1", 5, 9.0)
  val trade2: Trade = Trade("T1", "Case1", 5, 9.0)

  test("testValue") {

    assert(trade.value == 45.0)

    trade.setPrice(5)

    assert(trade.value == 25.0)
  }

  test("case class") {
//    toString and hashnode
    assert(trade1 == trade2)

//    equals
    val trade3 = trade1.copy()
    assert(trade3.equals(trade1))
  }

}
