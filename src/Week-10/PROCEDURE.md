# Week 10 - File Handling and Data Persistence

## Objective

To save warehouse inventory records to a file and read the saved records using Java file handling.

## Procedure

1. Import the required Java I/O classes, `ArrayList`, and `Scanner`.
2. Create an `InventoryProduct` class to store product ID, name, quantity, and reorder level.
3. Define a method to convert product details into comma-separated text.
4. Create the `data` directory if it does not exist.
5. Accept the number of products and their details from the user.
6. Validate the product ID, quantity, and reorder level.
7. Store the product objects in an `ArrayList`.
8. Use `FileWriter` and `BufferedWriter` to save product records to `data/inventory.txt`.
9. Use `FileReader` and `BufferedReader` to read the saved records.
10. Split each record into fields and reconstruct the product objects.
11. Display the saved product details and stock status.
12. Handle invalid numeric input using `NumberFormatException`.
13. Handle file-related errors using `IOException`.
14. Use try-with-resources to close file readers and writers automatically.
15. Compile and execute the program, then verify the saved file contents.