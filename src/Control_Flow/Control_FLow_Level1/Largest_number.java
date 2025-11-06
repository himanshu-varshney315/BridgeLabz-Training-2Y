package Control_FLow_Level1;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number:");
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.printf("The largest number is %d",a);
        } else if (b>a && b>c)
        {
            System.out.printf("The largest number is %d",b);
        }
        else
        {
            System.out.printf("The largest number is %d",c);
        }
    }
}
