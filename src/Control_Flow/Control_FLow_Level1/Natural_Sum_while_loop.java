package Control_FLow_Level1;

import java.util.Scanner;

public class Natural_Sum_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int Sum = n * (n + 1) / 2;

            int total = 0;
            int i = 1;
            while (i <= n) {
                total += i;
                i++;
            }

            System.out.println("Sum with while loop: " + total);
            System.out.println("Sum with formula: " + Sum);
            System.out.println("Both results are same: " + (total == Sum));
        } else {
            System.out.println("Please enter a natural number.");
        }
        sc.close();
    }
}
