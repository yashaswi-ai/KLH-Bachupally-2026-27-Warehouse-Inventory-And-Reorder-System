# Week 12 – Streams and Data Pipelines

## Aim
To implement an inventory data pipeline using the Java Streams API to filter products requiring reorder, calculate total inventory value, and sort products by quantity.

## Procedure

1. Import `ArrayList`, `List`, `Scanner`, and `Collectors` from the Java library.
2. Create an `InventoryProduct` class containing product ID, product name, quantity, reorder level, and price.
3. Create a constructor to initialize the product details.
4. Use an `ArrayList` to store inventory products.
5. Accept the number of products and their details from the user.
6. Validate the input to ensure that the product ID is positive, quantity and reorder level are non-negative, price is non-negative, and product name is not blank.
7. Use `stream()` and `filter()` to identify products whose quantity is less than or equal to their reorder level.
8. Use `collect(Collectors.toList())` to store the products requiring reorder.
9. Use `mapToDouble()` and `sum()` to calculate the total inventory value by multiplying each product's quantity by its price.
10. Use `sorted()` to arrange products in ascending order of quantity.
11. Use `forEach()` to display the reorder list and sorted inventory.
12. Display the total number of products and the number of products requiring reorder.

## Result
The inventory data pipeline was implemented and executed successfully using Java Streams. It identified products requiring reorder, calculated the total inventory value, and displayed the products sorted by quantity.