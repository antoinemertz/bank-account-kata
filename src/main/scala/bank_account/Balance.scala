package bank_account

class Balance {
  var balance: Int = 0

  def update(amount: Int): Unit = {
    this.balance = this.balance + amount
  }
}
