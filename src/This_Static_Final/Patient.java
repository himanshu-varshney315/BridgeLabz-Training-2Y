package This_Static_Final;
import java.util.Scanner;
class Patient {
    static String hospital_Name = "City Hospital";
    static int total_Patients = 0;
    private final int patient_ID;
    private String name;
    private int age;
    private String ailment;
    Patient(int patientID, String name, int age, String ailment) {
        this.patient_ID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        total_Patients++;
    }
    static int getTotalPatients() {
        return total_Patients;
    }
    void displayDetails() {
        if (this instanceof Patient)
        {
            System.out.println("Hospital: " + hospital_Name);
            System.out.println("Patient ID: " + patient_ID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
        else
        {
            System.out.println("Not a valid Patient object.");
        }
    }
}
class Hospital_Management_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();
        Patient[] patients = new Patient[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Patient " + (i + 1));
            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Ailment: ");
            String ailment = sc.nextLine();
            patients[i] = new Patient(id, name, age, ailment);
        }
        System.out.println("\nPatient Details:");
        for (Patient p : patients)
        {
            p.displayDetails();
            System.out.println();
        }
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
        sc.close();
    }
}
