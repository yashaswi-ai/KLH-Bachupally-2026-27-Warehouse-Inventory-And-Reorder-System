public class Product {

    int productId;
    String productName;
    int quantity;
    int reorderLevel;
    double price;

    Product(int productId, String productName, int quantity,
            int reorderLevel, double price) {

        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
        this.price = price;
    }
}
