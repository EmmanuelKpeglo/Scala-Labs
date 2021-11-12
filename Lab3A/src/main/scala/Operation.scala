object Operation extends App {

  def operation(op : String ):(Int, Int) => Int = {
    op.toLowerCase() match {
      case "add" => (firstNumber: Int, secondNumber: Int) => firstNumber + secondNumber
      case "subtract" => (firstNumber: Int, secondNumber: Int) => firstNumber - secondNumber
      case "power" => (firstNumber: Int, secondNumber: Int) => math.pow(firstNumber, secondNumber).toInt
      case _ => (firstNumber: Int, secondNumber: Int) => {
        println("Operation Unknown")
        print("Error ")
        404
      }
    }
  }

  var firstNumber = 6
  var secondNumber = 3
  println(s"Operations on the numbers $firstNumber and $secondNumber")
  println("\n****** Addition ******")
  val add = operation("ADD")
  println(add(firstNumber, secondNumber))

  println("\n****** Subtract ******")
  val subtract = operation("SUBTRACT")
  println(subtract(firstNumber, secondNumber))

  println("\n****** Power ******")
  val power = operation("POWER")
  println(power(firstNumber, secondNumber))

  println("\n****** Unknown ******")
  val unknown = operation("UNKOWN")
  println(unknown(firstNumber, secondNumber))

}
