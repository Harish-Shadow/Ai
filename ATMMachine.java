import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void increaseBalance(double amount) {
        balance += amount;
    }

    public void decreaseBalance(double amount) {
        balance -= amount;
    }
}

class ATMMachine {
    private BankAccount account;

    public ATMMachine(BankAccount account) {
        this.account = account;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Welcome to the ATM");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (account.getBalance() >= amount) {
                account.decreaseBalance(amount);
                System.out.println("Please take your cash.");
            } else {
                System.out.println("Insufficient balance. You don’t have enough money.");
            }
        } else {
            System.out.println("Invalid amount entered. Please enter a positive number.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            account.increaseBalance(amount);
            System.out.println("Amount deposited successfully. Your balance has been updated.");
        } else {
            System.out.println("Invalid deposit amount. Please try again with a positive number.");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + account.getBalance());
    }
}

public class Student {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000); // Let's start with a balance of 5000
        ATMMachine atm = new ATMMachine(account);
        atm.start();
    }
}
