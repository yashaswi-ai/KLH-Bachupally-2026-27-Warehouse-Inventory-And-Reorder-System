# Week 6 - Trace Table

## Test Case

Product IDs: 101, 102, 103, 104, 105  
Quantities: 25, 10, 50, 5, 30  
Search ID: 103  
Reorder Level: 10

## 1-D Array Trace

| Index | Product ID | Quantity |
|---|---:|---:|
| 0 | 101 | 25 |
| 1 | 102 | 10 |
| 2 | 103 | 50 |
| 3 | 104 | 5 |
| 4 | 105 | 30 |

## Search Trace

Search ID = 103

- Index 0 → 101 ≠ 103
- Index 1 → 102 ≠ 103
- Index 2 → 103 = 103 → Product found
- Quantity = 50

## Maximum and Minimum

Maximum quantity = 50

Minimum quantity = 5

## Low Stock Count

Reorder Level = 10

- Quantity 25 → Not low stock
- Quantity 10 → Low stock
- Quantity 50 → Not low stock
- Quantity 5 → Low stock
- Quantity 30 → Not low stock

Low Stock Products = 2

## 2-D Warehouse Array

| Row | Values |
|---|---|
| 0 | 10, 20, 30 |
| 1 | 15, 25, 35 |
| 2 | 5, 10, 15 |

## Final Results

Product 103 found with quantity: 50  
Maximum Stock Quantity: 50  
Minimum Stock Quantity: 5  
Low Stock Products: 2