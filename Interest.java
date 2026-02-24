class BankAccount {

    String account_holder_name;
    double balance;

 
    static double interest_rate = 5.0;   

 
    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    
    void displayInterest() {
        double interest = calculateInterest();
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);
        System.out.println();
    }


    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Interest rate updated to: " + interest_rate + "%");
        System.out.println();
    }

    
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("yachika", 20000);
        BankAccount acc2 = new BankAccount("maulie", 10000);

        acc1.displayInterest();
        acc2.displayInterest();

        
        BankAccount.updateInterestRate(7.0);

        acc1.displayInterest();
        acc2.displayInterest();
    }
}