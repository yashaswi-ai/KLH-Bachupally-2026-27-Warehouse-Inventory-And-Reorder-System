# Week 7 - Trace Table

## Test Case

- Product ID: 101
- Product Name: Laptop
- Initial Quantity: 5
- Reorder Level: Not used in this program
- Unit Price: Rs.50000
- Updated Quantity: 3

## 1. Object Creation

| Object | Product ID | Product Name | Quantity | Price |
|---|---:|---|---:|---:|
| product1 | 101 | Laptop | 5 | Rs.50000 |
| product2 | 102 | Mouse | 10 | Rs.800 |

## 2. Inventory Association

| Inventory Object | Warehouse Name | Associated Product |
|---|---|---|
| inventory1 | Main Warehouse | product1 |
| inventory2 | Storage Warehouse | product2 |

## 3. Stock Value Calculation

| Product | Calculation | Total Value |
|---|---|---:|
| Laptop initially | 5 × 50000 | Rs.250000.00 |
| Mouse | 10 × 800 | Rs.8000.00 |
| Laptop after update | 3 × 50000 | Rs.150000.00 |

## 4. Quantity Update Trace

1. The laptop object is created with quantity 5.
2. `setQuantity(3)` is called.
3. The method checks that the new quantity is non-negative.
4. The laptop quantity changes to 3.
5. The updated stock value is calculated as 3 × 50000 = Rs.150000.00.

## Final Results

- Laptop initial stock value: Rs.250000.00
- Mouse stock value: Rs.8000.00
- Laptop updated stock value: Rs.150000.00++++++++++++++++++++++++++++++++++++