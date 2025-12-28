/*3. Create class Customer with instance variables- accno, name, balance. Create parameterized constructor to set the customer details and a method showInfo() to display the customer details. Create two other methods- void deposit(int amount) and void withdraw(int amount). Print the deposited account and new balance, and same for withdraw. Also check if withdraw is possible or not. Provide a test class.*/
class Customer {
  private int accno;
  private String name; 
  private double balance;

  public Customer(int accno, String name, double balance) {
    this.accno=accno;
    this.name=name;
    this.balance=balance;
  }
  public void showInfo() {
    System.out.println("Account no: "+accno+" "+"Customer Name: "+name+" "+"Balance: "+balance);
  }
  public void deposit(int amount) {
    balance = balance + amount;
    System.out.println("Deposited amount: "+amount);
    System.out.println("New balance: "+balance);
  }
  public void withdraw(int amount) {
    if (amount > balance) {
      System.out.println("Insufficient amount!!");
    } else {
      balance = balance - amount;
      System.out.println("Withdrawn amount: "+amount);
      System.out.println("New balance: "+balance);
    }
  }
}

class TestCustomer {
  public static void main(String[] args) {
    Customer c = new Customer(99, "Marcus", 19003.59);
    c.showInfo();
    c.deposit(1000);
    c.withdraw(10000);
  }
}