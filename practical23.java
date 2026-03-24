import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    Scanner sc = new Scanner(System.in);

    void openAccount() {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
class SavingAccount extends BankAccount {

    double interestRate = 5;

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest on Savings Account: " + interest);
    }
}
class FixedDepositAccount extends BankAccount {

    double rate = 7;

    void maturityAmount() {
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double maturity = balance * (1 + (rate * years) / 100);
        System.out.println("Maturity Amount after " + years + " years: " + maturity);
    }
}
public class Practical23 {
    public static void main(String[] args) {
	System.out.println(" yachika : 240390107056");
        SavingAccount sa = new SavingAccount();
        System.out.println("----- Saving Account -----");
        sa.openAccount();
        sa.deposit();
        sa.withdraw();
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println();

        FixedDepositAccount fd = new FixedDepositAccount();
        System.out.println("----- Fixed Deposit Account -----");
        fd.openAccount();
        fd.deposit();
        fd.checkBalance();
        fd.maturityAmount();
    }
}