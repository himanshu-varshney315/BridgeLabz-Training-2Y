package Control_FLow_Level1;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your Age in Years:");
        int a = sc.nextInt();
        if(a>=18)
        {
            System.out.printf("The person's age is %d and can vote.",a);
        }
        else
        {
            System.out.printf("The person's age is %d and cannot vote.",a);
        }
    }
}
