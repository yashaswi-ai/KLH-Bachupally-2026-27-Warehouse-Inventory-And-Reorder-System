public class InventoryWeek06 {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   Warehouse Inventory - Week 6");
        System.out.println("=================================");

        // 1-D arrays
        int[] productIds = {101, 102, 103, 104, 105};
        int[] quantities = {25, 10, 50, 5, 30};

        System.out.println("\n---------- Product Inventory ----------");

        // Traversing the array
        for (int i = 0; i < productIds.length; i++) {

            System.out.println(
                "Product ID: " + productIds[i]
                + " | Quantity: " + quantities[i]
            );
        }

        // Search for a product
        int searchId = 103;
        boolean found = false;

        for (int i = 0; i < productIds.length; i++) {

            if (productIds[i] == searchId) {

                System.out.println(
                    "\nProduct " + searchId
                    + " found with quantity: "
                    + quantities[i]
                );

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nProduct not found.");
        }

        // Find maximum quantity
        int maximum = quantities[0];

        for (int i = 1; i < quantities.length; i++) {

            if (quantities[i] > maximum) {
                maximum = quantities[i];
            }
        }

        System.out.println(
            "Maximum Stock Quantity: " + maximum
        );

        // Find minimum quantity
        int minimum = quantities[0];

        for (int i = 1; i < quantities.length; i++) {

            if (quantities[i] < minimum) {
                minimum = quantities[i];
            }
        }

        System.out.println(
            "Minimum Stock Quantity: " + minimum
        );

        // Count low-stock products
        int lowStockCount = 0;
        int reorderLevel = 10;

        for (int quantity : quantities) {

            if (quantity <= reorderLevel) {
                lowStockCount++;
            }
        }

        System.out.println(
            "Low Stock Products: " + lowStockCount
        );

        // 2-D array representing warehouse sections
        int[][] warehouse = {
            {10, 20, 30},
            {15, 25, 35},
            {5, 10, 15}
        };

        System.out.println("\n---------- Warehouse Table ----------");

        for (int row = 0; row < warehouse.length; row++) {

            for (int column = 0;
                 column < warehouse[row].length;
                 column++) {

                System.out.print(
                    warehouse[row][column] + " "
                );
            }

            System.out.println();
        }

        System.out.println("--------------------------------------");
    }
}
