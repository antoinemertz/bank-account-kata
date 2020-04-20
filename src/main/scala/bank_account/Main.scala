package bank_account{}

object BankAccount extends App {
  val account = new Account(new TransactionHistory())

  account.deposit(100)
  account.withdraw(50)
  account.withdraw(70)
  account.deposit(amount = 50)
  account.printTransactions()
}
