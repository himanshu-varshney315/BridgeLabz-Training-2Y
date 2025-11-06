package This_Static_Final;
import java.util.Scanner;
class Bank_Account {
    static String bankName = "ABC National Bank";
    static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    Bank_Account(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    static void get_Total_Accounts() {
        System.out.println("Total accounts in " + bankName + ": " + totalAccounts);
    }
    void display_Details() {
        if (this instanceof Bank_Account)
        {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
        else
        {
            System.out.println("Not a valid BankAccount object.");
        }
    }
}

class Bank_Account_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter account number: ");
        int accNum1 = sc.nextInt();
        sc.nextLine();
        Bank_Account acc1 = new Bank_Account(name1, accNum1);
        System.out.print("Enter account holder name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter account number: ");
        int accNum2 = sc.nextInt();
        Bank_Account acc2 = new Bank_Account(name2, accNum2);
        System.out.println();
        acc1.display_Details();
        System.out.println();
        acc2.display_Details();
        System.out.println();
        Bank_Account.get_Total_Accounts();
        sc.close();
    }
}
