import java.util.Scanner;

// Custom exception
class InvalidQuantityException extends Exception {

    public InvalidQuantityException(String message) {
        super(message);
    }
}

// Interface
interface Reorderable {
    boolean needsReorder();
}

// Abstract parent class
abstract class InventoryItem {

    protected int productId;
    protected String productName;
    protected int quantity;
    protected int reorderLevel;

    public InventoryItem(int productId, String productName,
            int quantity, int reorderLevel)
            throws InvalidQuantityException {

        if (quantity < 0 || reorderLevel < 0) {
            throw new InvalidQuantityException(
                    "Quantity and reorder level cannot be negative.");
        }

        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
    }

    public abstract void displayDetails();
}

// Child class using inheritance
class ProductItem extends InventoryItem implements Reorderable {

    public ProductItem(int productId, String productName,
            int quantity, int reorderLevel)
            throws InvalidQuantityException {

        super(productId, productName, quantity, reorderLevel);
    }

    @Override
    public boolean needsReorder() {
        return quantity <= reorderLevel;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Reorder Level: " + reorderLevel);
        System.out.println(
                "Stock Status: "
                        + (needsReorder() ? "Reorder Required" : "Stock Available"));
    }
}

public class InventoryWeek08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=================================");
            System.out.println("   Warehouse Inventory - Week 8");
            System.out.println("=================================");

            System.out.print("Enter Product ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int quantity = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Reorder Level: ");
            int reorderLevel = Integer.parseInt(sc.nextLine());

            InventoryItem item = new ProductItem(id, name, quantity, reorderLevel);

            System.out.println("\n---------- Inventory Details ----------");
            item.displayDetails();

            // Lambda expression using the interface
            Reorderable check = () -> item instanceof Reorderable
                    && ((Reorderable) item).needsReorder();

            System.out.println(
                    "Lambda Reorder Check: "
                            + (check.needsReorder() ? "Yes" : "No"));

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid whole numbers.");
        } catch (InvalidQuantityException e) {
            System.out.println("Input Error: " + e.getMessage());
        } finally {
            System.out.println("Inventory check completed.");
            sc.close();
        }
    }
}