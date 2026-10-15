# Week 9 - Collections and Generics

## Objective

To use Java collections and generics to store, display, and search multiple products in the Warehouse Inventory and Reorder System.

## Procedure

1. Import the `ArrayList` and `Scanner` classes.
2. Create a generic class named `Inventory<T>`.
3. Use an `ArrayList<T>` to store inventory items.
4. Define a `Product` class containing product ID, name, quantity, and reorder level.
5. Create a constructor to initialize product details.
6. Implement a method to display product information and stock status.
7. Create an `InventoryWeek09` class containing the main method.
8. Accept the number of products from the user.
9. Read each product's details and add it to the inventory collection.
10. Display all stored products and their stock status.
11. Search for a product using its ID.
12. Display the product details if found; otherwise, display a message indicating that the product was not found.
13. Handle invalid numeric input using `NumberFormatException`.
14. Compile and execute the program using Java.
15. Test the program with existing and non-existing product IDs.