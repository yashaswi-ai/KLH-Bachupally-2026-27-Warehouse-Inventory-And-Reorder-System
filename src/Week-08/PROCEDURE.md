# Week 8 - Inheritance, Interfaces and Exceptions

## Objective

To apply inheritance, abstract classes, interfaces, method overriding, polymorphism, lambda expressions, and exception handling to the warehouse inventory system.

## Procedure

1. Create a custom checked exception named `InvalidQuantityException`.
2. Define the `Reorderable` interface with the `needsReorder()` method.
3. Create an abstract class `InventoryItem` to store common product details.
4. Validate the quantity and reorder level in the parent class constructor.
5. Create `ProductItem`, which extends `InventoryItem` and implements `Reorderable`.
6. Use `super()` to call the parent class constructor.
7. Override the `needsReorder()` and `displayDetails()` methods.
8. Use an `InventoryItem` reference to demonstrate polymorphism.
9. Use a lambda expression to check whether a reorder is required.
10. Handle invalid numeric input using `NumberFormatException`.
11. Handle negative quantities and reorder levels using `InvalidQuantityException`.
12. Use the `finally` block to display the completion message and close the scanner.
13. Compile and run the program using Java.
14. Test the program with valid input, negative quantities, and invalid numeric input.ss