# Week 8 - Trace Table

## Test Case 1: Valid Input

**Input:**
- Product ID: 101
- Product Name: Laptop
- Quantity: 5
- Reorder Level: 10

| Step | Operation | Result |
|---|---|---|
| 1 | Read product ID | 101 |
| 2 | Read product name | Laptop |
| 3 | Read quantity | 5 |
| 4 | Read reorder level | 10 |
| 5 | Check whether quantity is less than or equal to reorder level | true |
| 6 | Display stock status | Reorder Required |
| 7 | Perform lambda reorder check | Yes |
| 8 | Execute finally block | Inventory check completed. |

## Test Case 2: Negative Quantity

**Input:**
- Product ID: 102
- Product Name: Mouse
- Quantity: -2
- Reorder Level: 10

**Processing:** The constructor detects the negative quantity and throws `InvalidQuantityException`.

**Output:**
`Input Error: Quantity and reorder level cannot be negative.`

The `finally` block still executes and displays the completion message.

## Test Case 3: Invalid Number

**Input:**
- Product ID: 103
- Product Name: Keyboard
- Quantity: abc
- Reorder Level: 10

**Processing:** `Integer.parseInt("abc")` throws `NumberFormatException`.

**Output:**
`Error: Please enter valid whole numbers.`

The `finally` block still executes and displays the completion message.