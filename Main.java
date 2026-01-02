import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();

        while (true) {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Account Number: ");
                    long accNo = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Holder Name: ");
                    String name = sc.nextLine();
                    System.out.print("Initial Balance: ");
                    double bal = sc.nextDouble();
                    bank.createAccount(accNo, name, bal);
                    System.out.println("Account Created Successfully");
                    break;

                case 2:
                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();
                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();
                    bank.getAccount(accNo).deposit(amount);
                    System.out.println("Deposit Successful");
                    break;

                case 3:
                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();
                    System.out.print("Amount: ");
                    amount = sc.nextDouble();
                    bank.getAccount(accNo).withdraw(amount);
                    System.out.println("Withdrawal Successful");
                    break;

                case 4:
                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();
                    System.out.println("Balance: " +
                        bank.getAccount(accNo).getBalance());
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;
            }
        }
    }
}

