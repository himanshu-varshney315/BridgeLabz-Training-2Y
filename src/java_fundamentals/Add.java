package java_fundamentals;
import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Number1:");
        float a=sc.nextFloat();
        System.out.print("Number2:");
        float b=sc.nextFloat();
        System.out.printf("sum of two numbers:%.2f",a+b);
    }
}
