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

## ArrayList Size

```
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Print the size of each ArrayList below:
    
      
    // Print the name of the detective with the larger to-do list:
    
  }
  
}
```

1. Detectives do a lot to solve a case. But who has more to do?

    Print out the size of each detective’s to-do `ArrayList`:

* `sherlocksToDos` for Sherlock Holmes
* `poirotsToDos` for Hercule Poirot

2. So who has more to do? Print the name of the detective whose to-do list is longer. Was it Sherlock or Poirot?

## Accessing an Index

```
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    System.out.println("Sherlock's third to-do:");
    // Print Sherlock's third to-do:
    
    
    System.out.println("\nPoirot's second to-do:");
    // Print Poirot's second to-do:
    
    
  }
  
}
```

1. Use `get()` to access the third to-do element of `sherlocksToDos` and print the result.

2. Use `get()` to access the second to-do element of `poirotsToDos` and print the result.

## Changing a Value

```
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Set each to-do below:
    
    
    System.out.println("Sherlock's to-do list:");
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println("Poirot's to-do list:");
    System.out.println(poirotsToDos.toString());
  }
  
}
```

1. Modify `sherlocksToDos` so that the value at `"play violin"` becomes `"listen to Dr. Watson for amusement"`.

2. Modify `poirotsToDos` so that the value at `"trim mustache"` becomes `"listen to Captain Hastings for amusement"`.

## Removing a Value

```
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Remove each to-do below:
    
    
      
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println(poirotsToDos.toString());
  }
  
}
```

1. Sherlock Holmes and Hercule Poirot have each already visited their respective crime scenes.

    Remove `"visit the crime scene"` from `sherlocksToDos` and `poirotsToDos` using `remove()`.

    Moreover, Sherlock Holmes has also gotten some violin playing done.

    So you can remove `"play violin"` from `sherlocksToDos` as well.