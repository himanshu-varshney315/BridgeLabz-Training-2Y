package Control_FLow_Level1;

import java.util.Scanner;

public class Check_Spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        int a= sc.nextInt();
        System.out.print("Enter the date: ");
        int b = sc.nextInt();
        if(a<7 || b<32)
        {
            System.out.print("enter vaild value");
        }
        else if ((a==3 && b>=20 && b<=31 )||(a==4 && b<=30)||(a==5 && b<=31)||(a== 6 && b<=20))
        {
            System.out.print("Its a Spring Season");
        }
        else
        {
            System.out.print("Not a Spring Season");
        }
    }
}
