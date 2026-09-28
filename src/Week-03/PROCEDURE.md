# Week 3 - Selection and Decision Making

## Objective

To implement selection statements in Java for making inventory stock decisions and selecting product categories.

## Concepts Used

- if-else ladder
- Boolean operators
- Logical AND (`&&`)
- Logical OR (`||`)
- switch statement
- break statement
- default case
- Scanner for user input

## Procedure

1. Start the Java program.
2. Create a Scanner object to read user input.
3. Read the Product ID.
4. Read the Product Name.
5. Read the Quantity.
6. Read the Reorder Level.
7. Use an if-else ladder to determine the stock status.
8. If quantity is 0, display "Out of Stock".
9. If quantity is less than or equal to the reorder level, display "Reorder Required".
10. If quantity is within 10 units above the reorder level, display "Low Stock".
11. Otherwise, display "Stock Available".
12. Use Boolean operators to display reorder and warning messages.
13. Display product category options.
14. Use a switch statement to select the category.
15. Display "Unknown" when an invalid category is entered.
16. Close the Scanner and end the program.

## Expected Outcome

The program should correctly classify the stock status and display the selected product category based on the user's input.
