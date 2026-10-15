# Week 11 — Trace Table

## Sample Input

```text
Number of products: 2

Product 1:
ID: 101
Name: Laptop
Quantity: 5
Reorder Level: 10
Price: 50000

Product 2:
ID: 102
Name: Mouse
Quantity: 25
Reorder Level: 5
Price: 500
```

## Execution Trace

| Step | Operation | Result |
|---|---|---|
| 1 | Create ArrayList | Empty inventory list |
| 2 | Add Laptop object | 1 product stored |
| 3 | Add Mouse object | 2 products stored |
| 4 | Check Laptop quantity | 5 ≤ 10 |
| 5 | Determine Laptop status | Reorder Required |
| 6 | Check Mouse quantity | 25 > 5 |
| 7 | Determine Mouse status | Stock Available |
| 8 | Call `inventory.size()` | 2 products |

## Expected Output Summary

| Product | Quantity | Reorder Level | Stock Status |
|---|---:|---:|---|
| Laptop | 5 | 10 | Reorder Required |
| Mouse | 25 | 5 | Stock Available |

**Final Result:** The ArrayList stores two inventory objects, displays their details, and correctly identifies the stock status of each product.