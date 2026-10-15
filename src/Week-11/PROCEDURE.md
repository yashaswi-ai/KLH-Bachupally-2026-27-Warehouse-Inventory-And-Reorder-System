# Week 11 — Collections Framework

## Aim
To develop a Java inventory management program using the Collections Framework to store and display product details.

## Procedure
1. Import the `ArrayList` and `Scanner` classes.
2. Create an `InventoryItem` class with product ID, product name, quantity, reorder level, and price.
3. Define a constructor to initialize each product's details.
4. Create an `ArrayList<InventoryItem>` to store multiple inventory product objects dynamically.
5. Accept the number of products from the user using the `Scanner` class.
6. Read the product ID, name, quantity, reorder level, and price for each product.
7. Validate the entered values and reject invalid product details.
8. Add valid product objects to the ArrayList using the `add()` method.
9. Use an enhanced `for` loop to display the stored inventory details.
10. Check whether each product's quantity is less than or equal to its reorder level.
11. Display the stock status and total number of products using the `size()` method.

## Concepts Used
- Java Collections Framework
- ArrayList and its `add()` and `size()` methods
- Classes, objects, and constructors
- Scanner class
- Loops and conditional statements
- Input validation

## Result
The program successfully stores multiple inventory products in an ArrayList and displays their details, stock status, and total product count.