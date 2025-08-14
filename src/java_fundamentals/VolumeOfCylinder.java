package java_fundamentals;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius:");
        float r=sc.nextFloat();
        System.out.print("Enter height:");
        float h=sc.nextFloat();
        System.out.printf("volume:%.2f",Math.PI*r*h);
    }
}
