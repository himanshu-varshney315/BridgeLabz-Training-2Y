package Control_FLow_Level1;

import java.util.Scanner;

public class Divisibility_of_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        if(a%5==0)
        {
            System.out.printf("The number %d is divisible by 5",a);
        }
        else
        {
            System.out.printf("The number %d is not divisible by 5",a);
        }
    }
}
