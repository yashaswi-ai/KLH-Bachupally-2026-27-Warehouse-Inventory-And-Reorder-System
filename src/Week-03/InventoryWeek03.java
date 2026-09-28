import java.util.Scanner;

public class InventoryWeek03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   Warehouse Inventory - Week 3");
        System.out.println("=================================");

        System.out.print("Enter Product ID: ");
        int productId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Reorder Level: ");
        int reorderLevel = sc.nextInt();

        System.out.println("\n---------- Stock Decision ----------");

        // if-else ladder
        if (quantity == 0) {
            System.out.println("Stock Status: Out of Stock");
        } else if (quantity <= reorderLevel) {
            System.out.println("Stock Status: Reorder Required");
        } else if (quantity <= reorderLevel + 10) {
            System.out.println("Stock Status: Low Stock");
        } else {
            System.out.println("Stock Status: Stock Available");
        }

        // Boolean logic
        if (quantity > 0 && quantity <= reorderLevel) {
            System.out.println("Action: Place a reorder request.");
        }

        if (quantity == 0 || reorderLevel == 0) {
            System.out.println("Warning: Check inventory settings.");
        }

        // switch statement
        System.out.println("\n---------- Product Category ----------");
        System.out.println("1. Electronics");
        System.out.println("2. Furniture");
        System.out.println("3. Stationery");

        System.out.print("Enter category choice: ");
        int category = sc.nextInt();

        switch (category) {

            case 1:
                System.out.println("Category: Electronics");
                break;

            case 2:
                System.out.println("Category: Furniture");
                break;

            case 3:
                System.out.println("Category: Stationery");
                break;

            default:
                System.out.println("Category: Unknown");
        }

        System.out.println("--------------------------------------");

        sc.close();
    }
}
