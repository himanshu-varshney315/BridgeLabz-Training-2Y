package java_fundamentals;

import java.util.Scanner;

public class KmToM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value:");
        float b=sc.nextFloat();
        System.out.printf("Convert:%.2f",b*0.621371);

    }
}
