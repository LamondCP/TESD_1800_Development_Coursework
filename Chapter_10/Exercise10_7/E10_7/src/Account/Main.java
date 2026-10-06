package Account;

import java.util.Scanner;

public class Main {
    private static Account[] accounts = new Account[10];

    public static void main(String[] args) {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the ATM system.");
            System.out.println("Please enter your account ID (0-9):");
            int id = scanner.nextInt();

            while (id < 0 || id > 9) {
                System.out.println("Invalid ID. Please enter a correct account ID (0-9):");
                id = scanner.nextInt();
            }

            Account currentAccount = accounts[id];

            while (true) {
                System.out.println();
                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Current balance: $" + currentAccount.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount > currentAccount.getBalance()) {
                            System.out.println("Insufficient funds.");
                        } else {
                            currentAccount.withdraw(withdrawAmount);
                            System.out.println("Withdrawal successful.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        currentAccount.deposit(depositAmount);
                        System.out.println("Deposit successful.");
                        break;
                    case 4:
                        System.out.println("Exiting account menu.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

                if (choice == 4) {
                    break;
                }
            }
        }
    }
}
