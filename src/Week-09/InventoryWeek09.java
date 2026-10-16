import java.util.ArrayList;
import java.util.Scanner;

// Generic inventory collection
class Inventory<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public ArrayList<T> getItems() {
        return items;
    }
}

// Product class
class Product {
    int productId;
    String productName;
    int quantity;
    int reorderLevel;

    public Product(int productId, String productName,
            int quantity, int reorderLevel) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Reorder Level: " + reorderLevel);

        if (quantity <= reorderLevel) {
            System.out.println("Stock Status: Reorder Required");
        } else {
            System.out.println("Stock Status: Stock Available");
        }
    }
}

public class InventoryWeek09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory<Product> inventory = new Inventory<>();

        try {
            System.out.print("How many products do you want to add? ");
            int count = Integer.parseInt(sc.nextLine());

            if (count <= 0) {
                System.out.println("Please enter a positive number.");
                return;
            }

            for (int i = 0; i < count; i++) {
                System.out.println("\nEnter details for Product " + (i + 1));

                System.out.print("Product ID: ");
                int id = Integer.parseInt(sc.nextLine());

                System.out.print("Product Name: ");
                String name = sc.nextLine();

                System.out.print("Quantity: ");
                int quantity = Integer.parseInt(sc.nextLine());

                System.out.print("Reorder Level: ");
                int reorderLevel = Integer.parseInt(sc.nextLine());

                if (quantity < 0 || reorderLevel < 0) {
                    System.out.println(
                            "Quantity and reorder level cannot be negative.");
                    i--;
                    continue;
                }

                inventory.addItem(
                        new Product(id, name, quantity, reorderLevel));
            }

            System.out.println("\n===== All Inventory Products =====");

            for (Product product : inventory.getItems()) {
                product.displayDetails();
                System.out.println("------------------------------");
            }

            System.out.print("\nEnter Product ID to search: ");
            int searchId = Integer.parseInt(sc.nextLine());
            boolean found = false;

            for (Product product : inventory.getItems()) {
                if (product.productId == searchId) {
                    System.out.println("\nProduct Found:");
                    product.displayDetails();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Product not found.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid whole numbers.");
        } finally {
            System.out.println("Inventory check completed.");
            sc.close();
        }
    }
}