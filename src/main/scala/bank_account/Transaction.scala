package bank_account
import java.time.LocalDate

class Transaction(date: LocalDate, amount: Int, status: String) {
  def print(): Unit = {
    println("%s transaction at %s with amount of %d".format(status, date, amount))
  }
}
