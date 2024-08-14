# Basket class


| Member variable | Data type              |
|-----------------|------------------------|
| `bagels`        | `Hashmap<String, int>` |
| `basket`        | `List<String>`         |
| `basketSize`    | `int`                  |



| Method                | Scenario                                                                              | Output                       |
|-----------------------|---------------------------------------------------------------------------------------|------------------------------|
| `addBagel(String)`    | Basket not full<br/>Basket is full                                                    | Return true<br/>Return false |
| `removeBagel(String)` | Bagel exists in basket<br/>Bagel does not exist in basket                             | Return true<br/>Return false |
| `getBasketSize()`     |                                                                                       | Return basket size           |
| `setBasketSize(int)`  | Basket capacity is changed to a whole, positive number<br/>Basket capacity is invalid | Return true<br/>Return false |
