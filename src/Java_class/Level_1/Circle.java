package Java_class.Level_1;
import java.util.*;
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = scanner.nextDouble();
        Circle myCircle = new Circle(r);

        System.out.println("The area of the circle is: " + myCircle.calculateArea());
        System.out.println("The circumference of the circle is: " + myCircle.calculateCircumference());

        scanner.close();
    }
}
