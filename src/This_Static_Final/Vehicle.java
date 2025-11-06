package This_Static_Final;
import java.util.Scanner;
class Vehicle {
    static double registration_Fee = 5000.0;
    private final String registration_Number;
    private String owner_Name;
    private String vehicle_Type;
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.owner_Name = ownerName;
        this.vehicle_Type = vehicleType;
        this.registration_Number = registrationNumber;
    }
    static void update_Registration_Fee(double newFee) {
        registration_Fee = newFee;
    }
    void display_Details() {
        if (this instanceof Vehicle)
        {
            System.out.println("Owner Name: " + owner_Name);
            System.out.println("Vehicle Type: " + vehicle_Type);
            System.out.println("Registration Number: " + registration_Number);
            System.out.println("Registration Fee: " + registration_Fee);
        }
        else
        {
            System.out.println("Not a valid Vehicle object.");
        }
    }
}
 class Vehicle_Registration_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();
        Vehicle[] vehicles = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Vehicle " + (i + 1));
            System.out.print("Enter Owner Name: ");
            String owner = sc.nextLine();
            System.out.print("Enter Vehicle Type: ");
            String type = sc.nextLine();
            System.out.print("Enter Registration Number: ");
            String regNo = sc.nextLine();
            vehicles[i] = new Vehicle(owner, type, regNo);
        }
        System.out.print("\nEnter new registration fee (current " + Vehicle.registration_Fee + "): ");
        double newFee = sc.nextDouble();
        Vehicle.update_Registration_Fee(newFee);
        System.out.println();
        for (Vehicle v : vehicles) {
            v.display_Details();
            System.out.println();
        }
        sc.close();
    }
}
