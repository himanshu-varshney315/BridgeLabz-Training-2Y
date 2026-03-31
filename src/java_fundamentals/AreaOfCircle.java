package java_fundamentals;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius:");
        float r=sc.nextFloat();
        System.out.printf("Area:%.2f",r*r*Math.PI);
    }
}
