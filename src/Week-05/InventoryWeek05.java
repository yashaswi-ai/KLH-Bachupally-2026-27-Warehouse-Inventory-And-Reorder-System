import java.util.Scanner;

public class InventoryWeek05 {

    // Method 1: Display the inventory heading
    static void displayHeading() {
        System.out.println("\n=================================");
        System.out.println("   Warehouse Inventory - Week 5");
        System.out.println("=================================");
    }

    // Method 2: Check stock status
    static String checkStock(int quantity, int reorderLevel) {

        if (quantity <= reorderLevel) {
            return "Reorder Required";
        } else {
            return "Stock Available";
        }
    }

    // Method 3: Calculate inventory value
    static double calculateValue(int quantity, double price) {
        return quantity * price;
    }

    // Method 4: Overloaded method for integer values
    static int calculateValue(int quantity, int price) {
        return quantity * price;
    }

    // Method 5: Recursive calculation of total quantity
    static int totalQuantity(int quantity) {

        if (quantity <= 0) {
            return 0;
        }

        return quantity + totalQuantity(quantity - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        displayHeading();

        System.out.print("Enter Product ID: ");
        int productId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Reorder Level: ");
        int reorderLevel = sc.nextInt();

        System.out.print("Enter Unit Price: ");
        double price = sc.nextDouble();

        String stockStatus = checkStock(quantity, reorderLevel);

        double inventoryValue = calculateValue(quantity, price);

        int recursiveTotal = totalQuantity(quantity);

        System.out.println("\n---------- Inventory Details ----------");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Reorder Level: " + reorderLevel);
        System.out.println("Stock Status: " + stockStatus);
        System.out.printf("Inventory Value: Rs.%.2f%n", inventoryValue);
        System.out.println("Recursive Quantity Total: " + recursiveTotal);

        sc.close();
    }
}
