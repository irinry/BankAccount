public class BankAccount {
    double balance;

    public BankAccount (double balance) {
        this.balance = balance;
    }

    public void deposit(double money) {
        balance = money + balance;
        System.out.println("Customer has " + balance + " on his Account");
    }

    public boolean withdraw(double money) {
        if (money <= balance) {
            balance = balance - money;
            System.out.println("The operation is completed. Your Account has " + balance + " Euro");
            return true;
        } else {
            System.out.println("Your Account has not enough money. Operation failed.");
            return false;
        }
    }

    public void transfer(Customer to, double money) {
        boolean withdrawSucceeded = this.withdraw(money);
        if (withdrawSucceeded) {
            to.getAccount().deposit(money);
        }
    }
}

class Customer {

    private BankAccount account;
    private String name;

    public Customer(String name, double balance) {
        this.name = name;
        this.account = new BankAccount(balance);
    }

    public BankAccount getAccount() {
        return account;
    }

//    public void printBalance(){
//        System.out.println(name + " has " + this.account.balance );
//    }
    public static void main(String[] args) {
        Customer customer1 = new Customer("Irina", 300);
        customer1.getAccount().withdraw(250);
        //customer1.printBalance();

        Customer customer2 = new Customer("Colleague", 500);
        customer2.getAccount().withdraw(900);

        customer2.getAccount().deposit(600);
        customer2.getAccount().deposit(600);

        customer1.getAccount().transfer(customer2, 180);
    }
}


