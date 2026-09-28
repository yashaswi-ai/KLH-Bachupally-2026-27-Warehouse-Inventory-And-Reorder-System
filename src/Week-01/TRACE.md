# Week 1 - Trace Table

## Test Case 1 - Reorder Required

| Step | Product ID | Product Name | Quantity | Reorder Level | Condition | Output |
|---|---:|---|---:|---:|---|---|
| 1 | 101 | Laptop | 5 | 10 | - | Input accepted |
| 2 | 101 | Laptop | 5 | 10 | 5 <= 10 | Reorder Required |

## Test Case 2 - Stock Available

| Step | Product ID | Product Name | Quantity | Reorder Level | Condition | Output |
|---|---:|---|---:|---:|---|---|
| 1 | 102 | Mouse | 25 | 10 | - | Input accepted |
| 2 | 102 | Mouse | 25 | 10 | 25 <= 10 is false | Stock Available |

## Test Case 3 - Boundary Case

| Step | Product ID | Product Name | Quantity | Reorder Level | Condition | Output |
|---|---:|---|---:|---:|---|---|
| 1 | 103 | Keyboard | 10 | 10 | - | Input accepted |
| 2 | 103 | Keyboard | 10 | 10 | 10 <= 10 | Reorder Required |