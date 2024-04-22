import java.util.*;

public class Atm {
    public static void main(String[] args) {
        int balance = 1000000;
        while (true) {
            System.out.println("Press 1 for Check Balance");
            System.out.println("Press 2 for withdrwal");
            System.out.println("Press 3 for deposit");
            System.out.println("Press 4 for exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(balance);
                    break;
                case 2:
                    System.out.println("Enter the amount:");
                    int amount = sc.nextInt();
                    if (amount < balance) {
                        balance = balance - amount;
                        System.out.println("Please Collect your money");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;
                case 3:
                    System.out.println("Enter the amount to be deposited");
                    int deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Money deposited successfully");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }

        }

    }
}
