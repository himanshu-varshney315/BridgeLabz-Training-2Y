package Control_FLow_Level1;

import java.util.Scanner;

public class Sum_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int s = 0;
        System.out.print("Enter a number:");
        while (true) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            s = s+n;
        }
        System.out.println(s);
    }
}
