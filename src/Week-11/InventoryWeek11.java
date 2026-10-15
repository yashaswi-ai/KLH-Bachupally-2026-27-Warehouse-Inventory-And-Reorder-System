
import java.util.ArrayList;
import java.util.Scanner;

class InventoryItem {
    int productId;
    String productName;
    int quantity;
    int reorderLevel;
    double price;

    InventoryItem(int productId, String productName,
                  int quantity, int reorderLevel, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: Rs. " + price);

        if (quantity <= reorderLevel) {
            System.out.println("Status: Reorder Required");
        } else {
            System.out.println("Status: Stock Available");
        }
        System.out.println("---------------------------");
    }
}

public class InventoryWeek11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<InventoryItem> inventory = new ArrayList<>();

        System.out.print("How many products do you want to add? ");
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter Product " + (i + 1) + " details:");

            System.out.print("Product ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Quantity: ");
            int quantity = Integer.parseInt(sc.nextLine());

            System.out.print("Reorder Level: ");
            int reorderLevel = Integer.parseInt(sc.nextLine());

            System.out.print("Price: ");
            double price = Double.parseDouble(sc.nextLine());

            if (id <= 0 || quantity < 0 ||
                reorderLevel < 0 || price < 0) {
                System.out.println("Invalid details. Try again.");
                i--;
                continue;
            }

            inventory.add(
                new InventoryItem(id, name, quantity, reorderLevel, price)
            );
        }

        System.out.println("\n===== INVENTORY REPORT =====");

        for (InventoryItem item : inventory) {
            item.display();
        }

        System.out.println("Total products: " + inventory.size());

        sc.close();
    }
}
