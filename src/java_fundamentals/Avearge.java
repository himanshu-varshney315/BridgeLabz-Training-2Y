package java_fundamentals;

import java.util.Scanner;

public class Avearge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 number:");
        float a= sc.nextFloat();
        System.out.print("Enter 2 number:");
        float b=sc.nextFloat();
        System.out.print("Enter 3 number:");
        float c=sc.nextFloat();
        System.out.printf("Avearge:%.2f",(a+b+c)/3);
    }
}
