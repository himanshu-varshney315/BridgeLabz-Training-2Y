package Control_FLow_Level1;

import java.util.Scanner;

public class Sum_of_natural_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        if(a>=0)
        {
            float b= (a*(a+1))/2;
            System.out.printf("The sum of %d natural numbers is %.2f",a,b);
        }
        else
        {
            System.out.printf("The number %d is not a natural number",a);
        }
    }
}
