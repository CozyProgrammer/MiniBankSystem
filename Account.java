public class Account {
    private int accountNumber;
    private double balance;
    private Customer customer;

    public Account(int accountNumber,double balance,Customer customer){
      this.accountNumber=accountNumber;
      this.balance=balance;
      this.customer=customer;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

     public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    
}
