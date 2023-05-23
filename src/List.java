import java.util.ArrayList;

public class List {
  public static void main(String[] args) {
    // Create an ArrayList
    ArrayList<String> names = new ArrayList<String>();

    // Add a new ArrayList Item using the add() method
    names.add("Michael");
    names.add("Joseph");
    System.out.println(names);
    // Prints: [Michael, Joseph]

    // Access the size of the ArrayList using the size() method
    System.out.println(names.size());
    // Prints: 2

    // Find an item through its index using the get() method
    System.out.println(names.get(0));
    // Prints: Michael

    // Change an item's value by using the set() method
    names.set(1, "Eve");
    System.out.println(names);
    // Prints: [Michael, Eve]

    // Remove an item through its value by using the remove() method
    names.remove("Michael");
    System.out.println(names);
    // Prints: [Eve]

    // Retrieve the index of an item through its value by using the indexOf() method
    System.out.println(names.indexOf("Eve"));
    // Prints: 0
  }
}