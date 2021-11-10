
object project extends App {
  val trade : Trade = new Trade("T1", "APPl", 50, 5.0)
  println(trade)
  println("****************")
  println(trade.value)
  trade.setPrice(60)
  println(trade.getPrice)
  println(trade)
  println(trade.value)

//  companion stuff
//  var t = Trade("T1", "APPl", 50, 5.0)
//  println(Trade.hiha)

//  case class

}

