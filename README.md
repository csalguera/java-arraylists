## Java ArrayLists

## Introduction

```
import java.util.Arrays;

class Shopping {
  
  public static void main(String[] args) {
    
    String[] groceryItems = {"steak", "milk", "jelly beans"};
    double[] prices = {25.00, 2.95, 2.50};
    
    // Adding ham to the groceries
    groceryItems[3] = "ham";
    prices[3] = 4.99;
    
  }
  
}
```

1. In `Shopping.java` we’ve defined two arrays:

* `groceryItems`, a `String` array
* `prices`, a `double` array

We’ve tried to add a new item to the end of each. Run the code — does it work?

