import java.util.Scanner;

public class ATM {
    private double balance;
    private final String userPIN;

    public ATM(double initialBalance, String userPIN) {
        this.balance = initialBalance;
        this.userPIN = userPIN;
    }

    private void checkBalance() {
        System.out.printf("Your balance is: $%.2f%n", balance);
    }

    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("You've successfully deposited $%.2f%n", amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("You've successfully withdrawn $%.2f%n", amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    private boolean authenticate(String enteredPIN) {
        return enteredPIN.equals(userPIN);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        String enteredPIN = scanner.nextLine();

        if (!authenticate(enteredPIN)) {
            System.out.println("Incorrect PIN. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(500.0, "1234"); // Starting balance $500, PIN "1234"
        atm.start();
    }
}