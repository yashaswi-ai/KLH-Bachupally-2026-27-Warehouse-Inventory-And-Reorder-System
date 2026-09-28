# Week 3 - Trace Table

## Test Case 1 - Reorder Required

| Step | Quantity | Reorder Level | Condition | Output |
|---|---:|---:|---|---|
| 1 | 55 | 100 | quantity <= reorderLevel | Reorder Required |
| 2 | 55 | 100 | quantity > 0 && quantity <= reorderLevel | Place a reorder request |
| 3 | 55 | 100 | Category = 1 | Electronics |

## Test Case 2 - Low Stock

| Step | Quantity | Reorder Level | Condition | Output |
|---|---:|---:|---|---|
| 1 | 105 | 100 | quantity <= reorderLevel + 10 | Low Stock |
| 2 | 105 | 100 | Category = 2 | Furniture |

## Test Case 3 - Out of Stock

| Step | Quantity | Reorder Level | Condition | Output |
|---|---:|---:|---|---|
| 1 | 0 | 20 | quantity == 0 | Out of Stock |
| 2 | 0 | 20 | quantity == 0 || reorderLevel == 0 | Warning displayed |
| 3 | 0 | 20 | Category = 3 | Stationery |

## Test Case 4 - Stock Available

| Step | Quantity | Reorder Level | Condition | Output |
|---|---:|---:|---|---|
| 1 | 50 | 10 | quantity > reorderLevel + 10 | Stock Available |
| 2 | 50 | 10 | Category = 9 | Unknown |
