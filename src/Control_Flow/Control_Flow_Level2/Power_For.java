package Control_Flow_Level2;
import java.util.Scanner;
public class Power_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        System.out.print("Enter the Power : ");
        int power = sc.nextInt();
        int result = 1;

        if (number > 0 && power > 0) {
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(result);
        }
        sc.close();
    }
}
