package java_fundamentals;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Base:");
        float a=sc.nextFloat();
        System.out.print("Enter Power:");
        float b=sc.nextFloat();
        float res=(float) pow(a,b);
        System.out.printf("answer:%.2f",res);
    }
}
