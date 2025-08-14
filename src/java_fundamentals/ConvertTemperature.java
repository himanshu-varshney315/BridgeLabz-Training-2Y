package java_fundamentals;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        float a=sc.nextFloat();
        System.out.printf("Fahrenheit:%.2f",(a*9/5)+32);
    }
}
