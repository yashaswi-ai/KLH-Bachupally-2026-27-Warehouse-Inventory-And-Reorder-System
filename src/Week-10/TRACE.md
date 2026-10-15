# Week 10 - Trace Table

## Test Case 1: Save and Read Inventory Products

### Input

| Product ID | Product Name | Quantity | Reorder Level |
|---:|---|---:|---:|
| 101 | Laptop | 5 | 10 |
| 102 | Mouse | 25 | 5 |

### Trace

| Step | Operation | Result |
|---|---|---|
| 1 | Accept number of products | 2 |
| 2 | Read Laptop details | Product 101 created |
| 3 | Read Mouse details | Product 102 created |
| 4 | Create data directory if needed | Directory available |
| 5 | Write product records to file | Products saved successfully |
| 6 | Read saved file | Both records loaded |
| 7 | Check Laptop stock | Reorder Required |
| 8 | Check Mouse stock | Stock Available |
| 9 | Finish execution | Inventory check completed. |

### Program Output

```text
Products saved successfully.

===== Saved Inventory =====
Product ID: 101
Product Name: Laptop
Quantity: 5
Reorder Level: 10
Stock Status: Reorder Required
------------------------------
Product ID: 102
Product Name: Mouse
Quantity: 25
Reorder Level: 5
Stock Status: Stock Available
------------------------------
Inventory check completed.
```

## Test Case 2: Verify File Contents

**Command:** `Get-Content data\inventory.txt`

**Actual file contents:**

```text
101,Laptop,5,10
102,Mouse,25,5
```

Both product records were saved correctly in comma-separated format.

## Concepts Demonstrated

- File creation and directory handling.
- Writing data using `FileWriter` and `BufferedWriter`.
- Reading data using `FileReader` and `BufferedReader`.
- Reconstructing product objects from file records.
- Exception handling and try-with-resources.