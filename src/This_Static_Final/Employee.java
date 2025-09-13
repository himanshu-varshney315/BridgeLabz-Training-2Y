package This_Static_Final;
import java.util.Scanner;
class Employee {
    static String companyName = "Tech Solutions Pvt Ltd";
    static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    static void display_Total_Employees() {
        System.out.println("Total Employees in " + companyName + ": " + totalEmployees);
    }
    void display_Details() {
        if (this instanceof Employee)
        {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
        else
        {
            System.out.println("Not a valid Employee object.");
        }
    }
}

class Employee_Management_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter designation: ");
            String designation = sc.nextLine();
            employees[i] = new Employee(name, id, designation);
        }
        System.out.println();
        for (Employee e : employees) {
            e.display_Details();
            System.out.println();
        }
        Employee.display_Total_Employees();
        sc.close();
    }
}
