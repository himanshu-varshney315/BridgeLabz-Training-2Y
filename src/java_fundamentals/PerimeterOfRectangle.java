package java_fundamentals;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length:");
        float l= sc.nextFloat();
        System.out.print("Enter Breadth:");
        float b=sc.nextFloat();
        System.out.printf("Perimeter:%.2f",2*(l+b));
    }
}
