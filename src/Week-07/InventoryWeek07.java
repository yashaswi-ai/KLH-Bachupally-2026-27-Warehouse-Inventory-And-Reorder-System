
class Product {

    private int productId;
    private String productName;
    private int quantity;
    private double price;

    // Constructor
    public Product(int productId, String productName,
                   int quantity, double price) {

        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Update quantity
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    // Calculate product value
    public double calculateValue() {
        return quantity * price;
    }

    // Object representation
    @Override
    public String toString() {
        return "Product ID: " + productId
                + "\nProduct Name: " + productName
                + "\nQuantity: " + quantity
                + "\nPrice: Rs." + price;
    }
}

class Inventory {

    private String warehouseName;
    private Product product;

    public Inventory(String warehouseName, Product product) {
        this.warehouseName = warehouseName;
        this.product = product;
    }

    public void displayInventory() {
        System.out.println("Warehouse: " + warehouseName);
        System.out.println(product);
        System.out.printf("Total Product Value: Rs.%.2f%n",
                          product.calculateValue());
    }
}

public class InventoryWeek07 {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   Warehouse Inventory - Week 7");
        System.out.println("=================================");

        Product product1 = new Product(101, "Laptop", 5, 50000);
        Product product2 = new Product(102, "Mouse", 10, 800);

        Inventory inventory1 =
                new Inventory("Main Warehouse", product1);

        Inventory inventory2 =
                new Inventory("Storage Warehouse", product2);

        System.out.println("\n---------- Product 1 ----------");
        inventory1.displayInventory();

        System.out.println("\n---------- Product 2 ----------");
        inventory2.displayInventory();

        product1.setQuantity(3);

        System.out.println("\n---------- Updated Product 1 ----------");
        inventory1.displayInventory();
    }
}

