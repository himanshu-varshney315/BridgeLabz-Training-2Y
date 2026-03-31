package Control_FLow_Level1;

import java.util.Scanner;

public class While_counter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number to start the countdown: ");
        int counter = sc.nextInt();
        if(counter>0)
        {
            while (counter>0)
            {
                System.out.println("Counting down... " + counter);
                counter--;
            }
        }
        else
        {
                System.out.println("Please enter a positive number to start the countdown.");
        }

    }
}
