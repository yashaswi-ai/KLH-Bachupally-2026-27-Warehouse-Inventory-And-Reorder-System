import java.util.Scanner;

public class InventoryWeek04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n=================================");
            System.out.println("   Warehouse Inventory - Week 4");
            System.out.println("=================================");
            System.out.println("1. Check Stock");
            System.out.println("2. Count Products");
            System.out.println("3. Search Product ID");
            System.out.println("4. Show Numbers 1 to 5");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Quantity: ");
                int quantity = sc.nextInt();

                System.out.print("Enter Reorder Level: ");
                int reorderLevel = sc.nextInt();

                if (quantity <= reorderLevel) {
                    System.out.println("Stock Status: Reorder Required");
                } else {
                    System.out.println("Stock Status: Stock Available");
                }

            } else if (choice == 2) {

                System.out.print("Enter number of products: ");
                int numberOfProducts = sc.nextInt();

                int count = 1;

                while (count <= numberOfProducts) {
                    System.out.println("Product " + count);
                    count++;
                }

                System.out.println(
                    "Total Products: " + numberOfProducts
                );

            } else if (choice == 3) {

                System.out.print("Enter Product ID to search: ");
                int searchId = sc.nextInt();

                int[] productIds = {101, 102, 103, 104, 105};

                boolean found = false;

                for (int id : productIds) {

                    if (id == searchId) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    System.out.println("Product ID found.");
                } else {
                    System.out.println("Product ID not found.");
                }

            } else if (choice == 4) {

                System.out.println("Numbers from 1 to 5:");

                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                }

            } else if (choice == 5) {

                System.out.println("Exiting the system...");

            } else {

                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
