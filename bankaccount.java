import java.util.Scanner;
class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    static void searchAccount(BankAccount[] accounts, String searchId) {
        boolean found = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId.equals(searchId)) {
                System.out.println("\nAccount Found:");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nAccount not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[5];

        accounts[0] = new BankAccount();
        accounts[0].assignValues("A101", "Rahul", 5000);

        accounts[1] = new BankAccount();
        accounts[1].assignValues("A102", "Neha", 8000);

        accounts[2] = new BankAccount();
        accounts[2].assignValues("A103", "Amit", 12000);

        accounts[3] = new BankAccount();
        accounts[3].assignValues("A104", "Priya", 7000);

        accounts[4] = new BankAccount();
        accounts[4].assignValues("A105", "Kiran", 15000);

        System.out.println("All Bank Accounts:\n");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayValues();
            System.out.println();
        }

        System.out.print("Enter Account ID to search: ");
        String searchId = sc.nextLine();

        searchAccount(accounts, searchId);

        sc.close();
    }
}