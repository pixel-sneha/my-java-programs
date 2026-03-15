import java.util.Scanner;

public class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    public BankAccount() {
        this.accountId = "";
        this.accountHolderName = "";
        this.balance = 0.0;
    }

    public void assignValues(String accountId, String accountHolderName, double balance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void displayValues() {
        System.out.printf("Account ID: %s%n", this.accountId);
        System.out.printf("Holder Name: %s%n", this.accountHolderName);
        System.out.printf("Balance: %.2f%n", this.balance);
        System.out.println("---------------------------");
    }

    public static void searchById(BankAccount[] accounts, String searchId) {
        boolean found = false;
        for (BankAccount acc : accounts) {
            if (acc != null && acc.accountId.equals(searchId)) {
                System.out.println("Account found:");
                acc.displayValues();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account with ID " + searchId + " not found.");
        }
    }

    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];
        accounts[0] = new BankAccount();
        accounts[0].assignValues("A001", "Ravi Patel", 15000.50);

        accounts[1] = new BankAccount();
        accounts[1].assignValues("A002", "Aryan Patel", 25000.00);

        accounts[2] = new BankAccount();
        accounts[2].assignValues("A003","Urvi Patel", 5000.75);

        accounts[3] = new BankAccount();
        accounts[3].assignValues("A004", "Prit Desai", 120000.00);

        accounts[4] = new BankAccount();
        accounts[4].assignValues("A005", "Karan Joshi", 300.00);

        System.out.println("All bank accounts:");
        System.out.println("---------------------------");
        for (BankAccount acc : accounts) {
            acc.displayValues();
        }
        System.out.println("Demonstration searches:");
        searchById(accounts, "A003"); 
        searchById(accounts, "A999");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account ID to search: ");
        String inputId = scanner.nextLine().trim();
        searchById(accounts, inputId);
        scanner.close();
    }
}