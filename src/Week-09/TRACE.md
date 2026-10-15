# Week 9 - Trace Table

## Test Case 1: Multiple Products and Successful Search

**Input details:**

| Product ID | Product Name | Quantity | Reorder Level |
|---:|---|---:|---:|
| 101 | Laptop | 5 | 10 |
| 102 | Mouse | 25 | 5 |

Search ID: 101

| Step | Operation | Result |
|---|---|---|
| 1 | Create inventory collection | Empty `ArrayList` |
| 2 | Add Laptop | Product 101 stored |
| 3 | Add Mouse | Product 102 stored |
| 4 | Check Laptop stock | Reorder Required |
| 5 | Check Mouse stock | Stock Available |
| 6 | Search for ID 101 | Product Found |
| 7 | Display matching product | Laptop details displayed |
| 8 | Finish execution | Inventory check completed. |

## Test Case 2: Product Not Found

**Input details:**

| Product ID | Product Name | Quantity | Reorder Level |
|---:|---|---:|---:|
| 201 | Keyboard | 15 | 5 |

Search ID: 999

| Step | Operation | Result |
|---|---|---|
| 1 | Create inventory collection | Empty `ArrayList` |
| 2 | Add Keyboard | Product 201 stored |
| 3 | Display inventory | Stock Available |
| 4 | Search for ID 999 | No matching product |
| 5 | Display search result | Product not found. |
| 6 | Finish execution | Inventory check completed. |

## Concepts Demonstrated

- `ArrayList` for storing multiple products.
- Generics through `Inventory<T>`.
- Enhanced `for` loop for displaying and searching products.
- Conditional statements for reorder status and product search.
- Exception handling for invalid numeric input.