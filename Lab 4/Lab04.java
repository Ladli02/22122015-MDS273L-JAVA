import java.util.ArrayList;
import java.util.Scanner;

public class Lab04 {
    static int accountNumber;
    static String accountHolderName;
    static double accountBalance;
    static ArrayList<String> transactions = new ArrayList<String>();
    
    public static void initializeCustomer(int number, String name, double balance) {
        accountNumber = number;
        accountHolderName = name;
        accountBalance = balance;
    }
    
    public static void deposit(double amount) {
        accountBalance += amount;
        transactions.add("Deposit of " + amount + " made.");
    }
    
    public static void withdraw(double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
            transactions.add("Withdrawal of " + amount + " made.");
        } else {
            System.out.println("Insufficient account balance.");
        }
    }
    
    public static void printTransactions() {
        System.out.println("List of Transactions:");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
    
    public static void printAccountSummary() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
    }
    
    public static void displayMenu() {
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. Print transactions");
        System.out.println("4. Print account summary");
        System.out.println("5. Exit");
    }
    
    public static int getMenuChoice(Scanner input) {
        System.out.print("Enter choice (1-5): ");
        return input.nextInt();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Initialize customer
        initializeCustomer(12345, "John Smith", 0);
        
        while (true) {
            displayMenu();
            int choice = getMenuChoice(input);
            
            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double amount = input.nextDouble();
                deposit(amount);
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double amount = input.nextDouble();
                withdraw(amount);
            } else if (choice == 3) {
                printTransactions();
            } else if (choice == 4) {
                printAccountSummary();
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        
        input.close();
    }
}
