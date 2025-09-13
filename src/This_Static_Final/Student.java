package This_Static_Final;
import java.util.Scanner;
class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    static void display_Total_Students() {
        System.out.println("Total Students in " + universityName + ": " + totalStudents);
    }
    void display_Details() {
        if (this instanceof Student)
        {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
        else
        {
            System.out.println("Not a valid Student object.");
        }
    }
    void update_Grade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
        }
    }
    int get_Roll_Number() {
        return rollNumber;
    }
}
class University_Student_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter grade: ");
            String grade = sc.nextLine();
            students[i] = new Student(name, roll, grade);
        }
        System.out.println();
        for (Student s : students) {
            s.display_Details();
            System.out.println();
        }
        Student.display_Total_Students();
        System.out.print("\nDo you want to update a grade? (yes/no): ");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter roll number to update grade: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new grade: ");
            String newGrade = sc.nextLine();
            for (Student s : students) {
                if (s instanceof Student && roll == s.get_Roll_Number()) {
                    s.update_Grade(newGrade);
                    System.out.println("\nUpdated Details:");
                    s.display_Details();
                }
            }
        }
        sc.close();
    }
}
