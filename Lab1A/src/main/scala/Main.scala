import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date

object Main {
  def main ( args : Array [String] ): Unit = {

    var dateFormat = DateTimeFormatter.ofPattern("dd/MM/yy")

    def celsiusToFahrenheit (celsius : Double): Double = ((celsius * 9)/5) + 32
    println(celsiusToFahrenheit(9))

    def stringToDate (someDate : String): Unit = {
      var dateField = LocalDate.parse(someDate, dateFormat)
      println(dateField.getDayOfMonth + "st " + dateField.getMonth + " " + dateField.getYear)
    }

    stringToDate("01/02/15")

  }
}
