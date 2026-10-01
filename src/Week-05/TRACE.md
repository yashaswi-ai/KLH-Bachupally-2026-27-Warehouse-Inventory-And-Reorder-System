# Week 5 - Trace Table

## Test Case

Product ID: 101  
Product Name: Laptop  
Quantity: 5  
Reorder Level: 10  
Unit Price: 50000

## Trace

| Step | Variable / Expression | Value |
|---|---|---|
| 1 | productId | 101 |
| 2 | productName | Laptop |
| 3 | quantity | 5 |
| 4 | reorderLevel | 10 |
| 5 | price | 50000 |
| 6 | checkStock(5, 10) | Reorder Required |
| 7 | calculateValue(5, 50000) | 250000 |
| 8 | totalQuantity(5) | 15 |

## Recursive Calculation

```text
totalQuantity(5)
= 5 + totalQuantity(4)
= 5 + 4 + totalQuantity(3)
= 5 + 4 + 3 + totalQuantity(2)
= 5 + 4 + 3 + 2 + totalQuantity(1)
= 5 + 4 + 3 + 2 + 1
= 15