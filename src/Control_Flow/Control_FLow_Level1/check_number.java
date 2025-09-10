package Control_FLow_Level1;

import java.util.Scanner;

public class check_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        if (a>0)
        {
            System.out.print("Positive");
        }
        else if (a<0)
        {
            System.out.print("Negative");
        }
        else
        {
            System.out.print("Zero");
        }
    }
}
