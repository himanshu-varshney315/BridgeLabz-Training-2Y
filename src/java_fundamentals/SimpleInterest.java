package java_fundamentals;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal:");
        float p=sc.nextFloat();
        System.out.print("Enter Rate:");
        float r=sc.nextFloat();
        System.out.print("Enter Time:");
        float t=sc.nextFloat();
        System.out.printf("interest:%.2f",(p*r*t)/1000);
    }
}
