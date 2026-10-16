
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class InventoryProduct {
    int productId;
    String productName;
    int quantity;
    int reorderLevel;
    double price;

    InventoryProduct(int productId, String productName,
                     int quantity, int reorderLevel, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
        this.price = price;
    }
}

public class InventoryWeek12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<InventoryProduct> inventory = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.println("\nProduct " + (i + 1));

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
                reorderLevel < 0 || price < 0 || name.isBlank()) {
                System.out.println("Invalid details. Try again.");
                i--;
                continue;
            }

            inventory.add(new InventoryProduct(
                id, name, quantity, reorderLevel, price
            ));
        }

        System.out.println("\n===== INVENTORY DATA PIPELINE =====");

        List<InventoryProduct> reorderItems = inventory.stream()
            .filter(p -> p.quantity <= p.reorderLevel)
            .collect(Collectors.toList());

        System.out.println("\nProducts Requiring Reorder:");
        reorderItems.forEach(p ->
            System.out.println(p.productName + " - Quantity: " + p.quantity)
        );

        double totalValue = inventory.stream()
            .mapToDouble(p -> p.quantity * p.price)
            .sum();

        System.out.printf("\nTotal Inventory Value: Rs. %.2f%n", totalValue);

        List<InventoryProduct> sortedInventory = inventory.stream()
            .sorted((a, b) -> Integer.compare(a.quantity, b.quantity))
            .collect(Collectors.toList());

        System.out.println("\nProducts Sorted by Quantity:");
        sortedInventory.forEach(p ->
            System.out.println(p.productName + " - Quantity: " + p.quantity)
        );

        System.out.println("\nTotal Products: " + inventory.size());
        System.out.println("Products Requiring Reorder: " + reorderItems.size());

        sc.close();
    }
}

