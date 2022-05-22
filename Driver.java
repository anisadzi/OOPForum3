
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("==========================");
            System.out.println("Press 1 to Create an Account");
            System.out.println("Press 2 to Deposit");
            System.out.println("Press 3 to Withdraw");
            System.out.println("==========================");
        }

        int operation = in.nextInt();

        if(operation == 1){
            Account acc = new Account(0.0);
            System.out.println("Enter your first name: ");
            String firstName = in.next();
            System.out.println("Enter your last name: ");
            String lastName = in.next();

            Bank.addCustomer(firstName, lastName);
            System.out.println("You have successfully created an account.");
        }

        if(operation == 2){
            System.out.println("Enter the Index of the Account: ");
            int index = in.nextInt();
            System.out.println("Enter the amount of money to be deposited: ");
            int deposit = in.nextInt();

            Bank.getNumberOfCustomer(index-1).getCustomer.deposit(deposit);
            System.out.println("Your money has been deposited.");
        }

        if(operation == 3){
            System.out.println("Enter the Index of the Account: ");
            int index = in.nextInt();
            System.out.println("Enter the amount of money to be withdrawn: ");
            int withdraw = in.nextInt();

            Bank.getCustomer(index-1).getAccount.withdraw(withdraw);
            System.out.println("Balance :", (balance %f \n), bank.getCustomer(index-1).getAccount().getBalance());
        }
    }
}
