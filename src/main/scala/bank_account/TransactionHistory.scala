import java.time.LocalDate

import bank_account.{Balance, Transaction}

package bank_account{}

class TransactionHistory {

  private var transactions: List[Transaction] = Nil
  private val now: LocalDate = LocalDate.now()

  def addTransaction(amount: Int): Unit = {
    val tr: Transaction = new Transaction(now, amount, status="Accepted")
    transactions = transactions :+ tr
  }

  def rejectTransaction(amount: Int): Unit = {
    val tr: Transaction = new Transaction(now, amount, status="Rejected")
    transactions = transactions :+ tr
  }

  def print(balance: Balance): Unit = {
    for(transaction <- transactions) (transaction.print())
    println("Balance = %d".format(balance.balance))
  }
}