package Control_Flow_Level2;
import java.util.Scanner;
public class Youngest_Friend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Age Ammar : ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter a Height Amar: ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter a Age Akbar : ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter a Height Akbar : ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter a Age Anthony : ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter a Height Anthony : ");
        int heightAnthony = sc.nextInt();

        String youngest = "";
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony)
            youngest = "Amar";
        else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony)
            youngest = "Akbar";
        else
            youngest = "Anthony";

        String tallest = "";
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony)
            tallest = "Amar";
        else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony)
            tallest = "Akbar";
        else
            tallest = "Anthony";

        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);

        sc.close();
    }
}
