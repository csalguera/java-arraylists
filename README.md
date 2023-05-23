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

## Creating ArrayLists

```
// import the ArrayList package here:


class ToDos {
  
  public static void main(String[] args) {
    
    // Create toDoList below:
    
    
  }
  
}
```

1. Import the `ArrayList` package from `java.util`.

2. Create a new `ArrayList` that will contain `String` elements and call it `toDoList`.

## Adding an Item

```
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    // Add more to-dos here:
    
    
    // Add to-dos to toDoList
    
    
    System.out.println(toDoList);
      
    
  }
  
}
```

1. We’ve created an empty `ArrayList` called `toDoList`. Time to add some to-dos!

Below where we’ve initialized `toDo1`, initialize two new String variables: `toDo2` and `toDo3`.

Set their values to any tasks you like.

2. Use `.add()` to add `toDo1`, `toDo2`, and `toDo3` to `toDoList`.