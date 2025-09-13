package This_Static_Final;
import java.util.Scanner;
class Product {
    static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;
    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    static void update_Discount(double newDiscount) {
        discount = newDiscount;
    }
    void display_Details() {
        if (this instanceof Product)
        {
            double total = (price * quantity);
            double discountedPrice = total - (total * discount / 100);
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Price (after " + discount + "% discount): " + discountedPrice);
        }
        else
        {
            System.out.println("Not a valid Product object.");
        }
    }
}

class Shopping_Cart_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        Product[] cart = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1));
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();
            cart[i] = new Product(id, name, price, qty);
        }
        System.out.print("\nEnter new discount percentage (current " + Product.discount + "%): ");
        double newDiscount = sc.nextDouble();
        Product.update_Discount(newDiscount);
        System.out.println();
        for (Product p : cart) {
            p.display_Details();
            System.out.println();
        }
        sc.close();
    }
}

