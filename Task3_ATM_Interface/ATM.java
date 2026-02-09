import java.util.Scanner;

public class ATM {

    private double balance = 10000;
    private int pin = 1234;

    public void checkPin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            menu();
        } else {
            System.out.println("❌ Invalid PIN. Try again.");
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("🙏 Thank you for using ATM");
                    return;
                default:
                    System.out.println("❌ Invalid choice");
            }
        }
    }

    public void checkBalance() {
        System.out.println("💰 Current Balance: ₹" + balance);
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("✅ Amount Deposited Successfully");
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("✅ Please collect your cash");
        } else {
            System.out.println("❌ Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkPin();
    }
}
