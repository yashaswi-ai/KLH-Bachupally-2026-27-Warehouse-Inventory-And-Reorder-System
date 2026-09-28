import java.util.Scanner;

public class InventoryWeek02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Constant for warehouse handling fee
        final double HANDLING_RATE = 0.05;

        System.out.println("=================================");
        System.out.println("   Warehouse Inventory - Week 2");
        System.out.println("=================================");

        System.out.print("Enter Product ID: ");
        int productId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Unit Price: ");
        double unitPrice = sc.nextDouble();

        // Calculate inventory value
        double subtotal = quantity * unitPrice;

        // Calculate handling fee
        double handlingFee = subtotal * HANDLING_RATE;

        // Calculate final value
        double totalValue = subtotal + handlingFee;

        System.out.println("\n---------- Inventory Receipt ----------");

        System.out.printf("Product ID: %d%n", productId);
        System.out.printf("Product Name: %s%n", productName);
        System.out.printf("Quantity: %d%n", quantity);
        System.out.printf("Unit Price: Rs.%.2f%n", unitPrice);
        System.out.printf("Subtotal: Rs.%.2f%n", subtotal);
        System.out.printf("Handling Fee (5%%): Rs.%.2f%n", handlingFee);
        System.out.printf("Total Value: Rs.%.2f%n", totalValue);

        System.out.println("---------------------------------------");

        sc.close();
    }
}
    

