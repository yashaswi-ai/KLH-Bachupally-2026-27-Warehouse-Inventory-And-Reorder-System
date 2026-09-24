import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();

        int choice = 0;

        while (choice != 7) {

            System.out.println("\n=================================");
            System.out.println("    Warehouse Inventory System");
            System.out.println("=================================");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Check Reorder");
            System.out.println("4. Search Product");
            System.out.println("5. Update Quantity");
            System.out.println("6. Delete Product");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Product ID: ");
                int productId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Product Name: ");
                String productName = sc.nextLine();

                System.out.print("Enter Quantity: ");
                int quantity = sc.nextInt();

                System.out.print("Enter Reorder Level: ");
                int reorderLevel = sc.nextInt();

                System.out.print("Enter Price: ");
                double price = sc.nextDouble();

                Product product = new Product(
                    productId,
                    productName,
                    quantity,
                    reorderLevel,
                    price
                );

                products.add(product);

                System.out.println("\nProduct added successfully!");
            }

            else if (choice == 2) {

                if (products.isEmpty()) {

                    System.out.println("\nNo products available.");

                } else {

                    System.out.println("\n---------- All Products ----------");

                    for (Product product : products) {

                        System.out.println("Product ID: " + product.productId);
                        System.out.println("Product Name: " + product.productName);
                        System.out.println("Quantity: " + product.quantity);
                        System.out.println("Reorder Level: " + product.reorderLevel);
                        System.out.println("Price: ₹" + product.price);

                        System.out.println("-----------------------------");
                    }
                }
            }

            else if (choice == 3) {

                if (products.isEmpty()) {

                    System.out.println("\nNo products available.");

                } else {

                    System.out.println("\n---------- Reorder Status ----------");

                    for (Product product : products) {

                        if (product.quantity <= product.reorderLevel) {

                            int orderQuantity =
                                    product.reorderLevel - product.quantity;

                            System.out.println(
                                product.productName + " → Reorder Required"
                            );

                            System.out.println(
                                "Current Stock: " + product.quantity
                            );

                            System.out.println(
                                "Reorder Level: " + product.reorderLevel
                            );

                            System.out.println(
                                "Suggested Order Quantity: "
                                + orderQuantity
                            );

                        } else {

                            System.out.println(
                                product.productName + " → Stock Available"
                            );
                        }

                        System.out.println("-----------------------------");
                    }
                }
            }

            else if (choice == 4) {

                sc.nextLine();

                System.out.print("Enter product name to search: ");
                String searchName = sc.nextLine();

                boolean found = false;

                for (Product product : products) {

                    if (product.productName.equalsIgnoreCase(searchName)) {

                        System.out.println("\nProduct Found!");
                        System.out.println("Product ID: " + product.productId);
                        System.out.println("Product Name: " + product.productName);
                        System.out.println("Quantity: " + product.quantity);
                        System.out.println("Reorder Level: " + product.reorderLevel);
                        System.out.println("Price: ₹" + product.price);

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println("Product not found.");
                }
            }

            else if (choice == 5) {

                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();

                boolean found = false;

                for (Product product : products) {

                    if (product.productId == id) {

                        System.out.print("Enter new quantity: ");
                        int newQuantity = sc.nextInt();

                        product.quantity = newQuantity;

                        System.out.println(
                            "Quantity updated successfully!"
                        );

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println("Product not found.");
                }
            }

            else if (choice == 6) {

                System.out.print("Enter Product ID to delete: ");
                int id = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < products.size(); i++) {

                    if (products.get(i).productId == id) {

                        products.remove(i);

                        System.out.println(
                            "Product deleted successfully!"
                        );

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println("Product not found.");
                }
            }

            else if (choice == 7) {

                System.out.println("\nExiting the system...");
            }

            else {

                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
