package Control_Flow_Level2;
import java.util.Scanner;
public class Power_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        System.out.print("Enter the Power : ");
        int power = sc.nextInt();
        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println(result);
        sc.close();
    }
}
