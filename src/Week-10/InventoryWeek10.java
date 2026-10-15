
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class InventoryProduct {
    int productId;
    String productName;
    int quantity;
    int reorderLevel;

    public InventoryProduct(int productId, String productName,
                            int quantity, int reorderLevel) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
    }

    public String toFileFormat() {
        return productId + "," + productName + ","
                + quantity + "," + reorderLevel;
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

public class InventoryWeek10 {

    private static final String FILE_NAME = "data/inventory.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<InventoryProduct> products = new ArrayList<>();

        try {
            File file = new File(FILE_NAME);
            File parent = file.getParentFile();

            if (!parent.exists()) {
                parent.mkdirs();
            }

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

                if (id <= 0 || quantity < 0 || reorderLevel < 0) {
                    System.out.println(
                        "ID must be positive; quantity and reorder level cannot be negative."
                    );
                    i--;
                    continue;
                }

                products.add(
                    new InventoryProduct(id, name, quantity, reorderLevel)
                );
            }

            // Save products to a file
            try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FILE_NAME))) {
                for (InventoryProduct product : products) {
                    writer.write(product.toFileFormat());
                    writer.newLine();
                }
            }

            System.out.println("\nProducts saved successfully.");

            // Read products from the file
            System.out.println("\n===== Saved Inventory =====");

            try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    String[] details = line.split(",", -1);

                    if (details.length != 4) {
                        System.out.println("Skipping invalid record: " + line);
                        continue;
                    }

                    try {
                        InventoryProduct product =
                            new InventoryProduct(
                                Integer.parseInt(details[0]),
                                details[1],
                                Integer.parseInt(details[2]),
                                Integer.parseInt(details[3])
                            );

                        product.displayDetails();
                        System.out.println("------------------------------");
                    } catch (NumberFormatException e) {
                        System.out.println("Skipping invalid record: " + line);
                    }
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid whole numbers.");
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        } finally {
            System.out.println("Inventory check completed.");
            sc.close();
        }
    }
}
