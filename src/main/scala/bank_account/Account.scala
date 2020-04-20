import bank_account.Balance
package bank_account{}

class Account(transactionHistory: TransactionHistory) {

  private var balance = new Balance()

  def checkBalance(amount: Int): Boolean = {
    amount <= this.balance.balance
  }

  def deposit(amount: Int): Unit = {
    transactionHistory.addTransaction(amount)
    this.balance.update(amount)
  }

  def withdraw(amount: Int): Unit = {
    if (checkBalance(amount)) {
      transactionHistory.addTransaction(-amount)
      this.balance.update(-amount)
    } else {
      transactionHistory.rejectTransaction(-amount)
    }
  }

  def printTransactions(): Unit = {
    transactionHistory.print(this.balance)
  }
}
