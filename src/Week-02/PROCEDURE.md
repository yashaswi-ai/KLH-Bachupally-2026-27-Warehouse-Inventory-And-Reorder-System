# Week 2 - Procedure

## Title

Data, Types and the Intake Shell - Warehouse Inventory and Reorder System

## Objective

To use Java data types, variables, constants, arithmetic operators, Scanner input and formatted output to create an interactive inventory intake program.

## Problem

The system accepts the details of one warehouse product and calculates its inventory value and handling fee.

## Inputs

- Product ID
- Product Name
- Quantity
- Unit Price

## Process

1. Read the product ID.
2. Read the product name.
3. Read the quantity.
4. Read the unit price.
5. Calculate the subtotal using quantity multiplied by unit price.
6. Calculate the handling fee using a fixed 5% handling rate.
7. Calculate the total inventory value.
8. Display the product details and calculated values.

## Output

The program displays an inventory receipt containing the product details, subtotal, handling fee and total value.

## Formulae

Subtotal = Quantity × Unit Price

Handling Fee = Subtotal × 5%

Total Value = Subtotal + Handling Fee

## Data Types Used

- `int` - Product ID and Quantity
- `double` - Unit Price, Subtotal, Handling Fee and Total Value
- `String` - Product Name
- `final double` - Handling Rate constant

## Java Concepts Used

- Primitive data types
- Variables
- Literals
- Constants
- Arithmetic operators
- Scanner
- Type selection
- Formatted output using `printf()`
- `double` calculations

## Algorithm

1. Start.
2. Create a Scanner object.
3. Set the handling rate to 5%.
4. Read Product ID.
5. Read Product Name.
6. Read Quantity.
7. Read Unit Price.
8. Calculate Subtotal.
9. Calculate Handling Fee.
10. Calculate Total Value.
11. Display the inventory receipt.
12. Close the Scanner.
13. Stop.