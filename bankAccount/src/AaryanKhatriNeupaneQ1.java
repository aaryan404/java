import java.util.Scanner;

//creating a class called acc_balance so that we could create customer objects
class BankAccount {
    public double acc_balance;

    public BankAccount() {
        //by default the account will be having opeining balance of $500
        acc_balance = 500.0;
    }
    //this returns the total balance of the account
    public double totalAccountBalance() {
        return acc_balance;
    }
    //this method is for deposit
    public void deposit(double amount) {
        acc_balance += amount;
    }
    //withdraw method checks if the condition meets or not and performs the opertaion
    //returns the boolean
    public boolean withdraw(double withdraw2 ) {
        if (withdraw2 <= acc_balance) {
            acc_balance -= withdraw2;
            return true;
        } else {
            System.out.println("Insufficient balance");
            return false;
        }
    }
}

public class AaryanKhatriNeupaneQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //creating two customers as objects, this will add $500 as the default initial balance
        BankAccount customer1 = new BankAccount();
        BankAccount customer2 = new BankAccount();

        // taking input for the first deposit
        System.out.print("enter the amount to deposit for Customer 1: $");
        double deposit1 = input.nextDouble();
        //this function will add the deposit amount to the initial $500
        customer1.deposit(deposit1);
        System.out.println("total balance for customer 1 : $" + customer1.totalAccountBalance());

        //amount for withdraw from customer 2
        System.out.print("enter the amount to withdraw for customer2: $");
        double withdraw2 = input.nextDouble();

        //this checks if there is some return from the withdraw method
        if (customer2.withdraw(withdraw2)) {
            System.out.println("total balance for customer 2 : $" + customer2.totalAccountBalance());
        }

    }
}

