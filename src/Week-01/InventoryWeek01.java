import java.util.Scanner;

public class InventoryWeek01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int productId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Reorder Level: ");
        int reorderLevel = sc.nextInt();

        System.out.println("\n---------- Inventory Details ----------");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Reorder Level: " + reorderLevel);

        if (quantity <= reorderLevel) {
            System.out.println("Stock Status: Reorder Required");
        } else {
            System.out.println("Stock Status: Stock Available");
        }

        sc.close();
    }
}
