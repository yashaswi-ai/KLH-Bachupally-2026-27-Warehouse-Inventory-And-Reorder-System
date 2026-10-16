# Week 12 – Program Trace

## Sample Input

| Product ID | Product Name | Quantity | Reorder Level | Price (Rs.) |
|---:|---|---:|---:|---:|
| 101 | Laptop | 5 | 10 | 50000 |
| 102 | Mouse | 25 | 5 | 500 |
| 103 | Keyboard | 3 | 5 | 1500 |

## Step-by-Step Execution

1. The program reads three products from the user and stores them in an `ArrayList`.
2. The `stream()` and `filter()` operations select products whose quantity is less than or equal to their reorder level.
3. Laptop has quantity 5 and reorder level 10, so it requires reorder.
4. Mouse has quantity 25 and reorder level 5, so it does not require reorder.
5. Keyboard has quantity 3 and reorder level 5, so it requires reorder.
6. The `mapToDouble()` operation calculates each product's stock value by multiplying quantity by price:
   - Laptop: 5 × 50000 = Rs. 250000
   - Mouse: 25 × 500 = Rs. 12500
   - Keyboard: 3 × 1500 = Rs. 4500
7. The `sum()` operation calculates the total inventory value: Rs. 267000.
8. The `sorted()` operation arranges products in ascending order of quantity: Keyboard, Laptop, Mouse.
9. The program displays the total product count as 3 and the reorder count as 2.

## Expected Result

- Products requiring reorder: Laptop and Keyboard.
- Total inventory value: Rs. 267000.00.
- Products sorted by quantity: Keyboard, Laptop, Mouse.
- Total products: 3.
- Products requiring reorder: 2.

## Conclusion

The program demonstrates how Java Streams can process inventory data through filtering, mapping, sorting, aggregation, and collection operations.
