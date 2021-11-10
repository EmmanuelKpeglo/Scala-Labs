case class Trade (val id : String,
             val symbol : String,
             private var quantity : Int,
             private var price : Double) {

  def this(id: String, symbol: String, quantity: Int) = {
    this(id, symbol, quantity, 0)
  }

  def getPrice: Double = price

  def setPrice (price : Double): Unit = {
    if(price >= 0 ) {
      this.price = price
    }
  }

  def value: Double = quantity * price

//  override def toString: String =
//    s"""
//        ID = $id
//        Symbol = $symbol
//        Quantity = $quantity
//        Price = $price
//       """

}

//object Trade {
//  def apply(i: String, sym: String, q: Int, p: Double) = new Trade(i, sym, q, p)
//  var hiha : String = "I am ............."
//}
