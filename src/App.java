import java.util.Arrays;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    /*
     * ------------
     * Introduction
     * ------------
     * 
     * To create mutable and dynamic lists, we can use Java's ArrayList class
     * 
     * It allows us to:
     * 
     * store object references as elements
     * store elements 
     * access elements by index
     * add elements
     * remove elements
     * 
     * To use ArrayList, we need to import them:
     */

    // import java.util.ArrayList;

    /*
     * -------------------
     * Creating ArrayLists
     * -------------------
     * 
     * To create an ArrayList, we need to declare the type of objects it will hold, just as we do with arrays:
     */

    // ArrayList<String> babyNames;

    /*
     * We use angle brackets to declare the type of the ArrayList
     * 
     * These symbols are for generics
     * 
     * Generics are a Java construct that allows us to define classes and objects as parameters of an ArrayList
     * 
     * For this reson, we can't use primitive data types in an ArrayList:
     */

    // Will NOT compile
    // ArrayList<int> ages;

    // Will compile
    // ArrayList<Integer> ages;

    /*
     * The <Integer> generic must be used in an ArrayList instead
     * 
     * Double and Character generics substitute double and char data types
     * 
     * We can initialize an empty array using the new keyword:
     */
    
    // Declaring:
    ArrayList<Integer> ages;

    // Initializing:
    ages = new ArrayList<Integer>();

    // Declaring and Initializing in single line:
    ArrayList<String> babyNames = new ArrayList<String>();

    /*
     * --------------
     * Adding an Item
     * --------------
     * 
     * ArrayList comes with an add() method which inserts an element into the structure
     * 
     * There are two ways we can use add()
     * 
     * If we want to add an element to the end of the ArrayList, we'll call add() using only one argument that represents the value we are inserting
     */

    babyNames.add("Joseph");
    babyNames.add("Elizabeth");
    System.out.println(babyNames);
    // Prints:
    // [Joseph, Elizabeth]

    /*
     * If we want to add an element at a specific index of our ArrayList, we'll need two arguments in our method call
     *
     * the first argument will define the index and the second argument defines the value:
     */

    babyNames.add(1, "Alexander");
    System.out.println(babyNames);
    // Prints:
    // [Joseph, Alexander, Elizabeth]
    babyNames.add(1, "Tristan");
    System.out.println(babyNames);
    // Prints:
    // [Joseph, Tristan, Alexander, Elizabeth]

    /*
     * When providing an argument for the index, if an element exists on the index, it will be shifted to the right by 1
     * 
     * Otherwise if the index does not exist, an error will occur
     */

    /*
     * --------------
     * ArrayList Size
     * --------------
     * 
     * To view the amount of items/elements within an ArrayList, we use the size() method:
     */

    System.out.println(babyNames.size());
    // Prints: 4

    /*
     * ------------------
     * Accessing an Index
     * ------------------
     * 
     * We can use bracket [] notation to access a value at a particular index of an array:
     */

    double[] ratings = {3.2, 2.5, 1.7};
    System.out.println(ratings[1]);
    // Prints: 2.5
    // 3.2 is index 0
    // 2.5 is index 1
    // 1.7 is index 2

    /*
     * Bracket notation does not work for ArrayLists
     * instead, we use the get() method to access an index:
     */

    ArrayList<String> shoppingCart = new ArrayList<String>();
    shoppingCart.add("Trench Coat");
    shoppingCart.add("Tweed Houndstooth Hat");
    shoppingCart.add("Magnifying Glass");
    System.out.println(shoppingCart.get(0));
    // Prints: Trench Coat

    /*
     * ----------------
     * Changing a Value
     * ----------------
     * 
     * We can assign new values to arrays by using bracket notation:
     */

    ratings[0] = 3.14;
    System.out.println(Arrays.toString(ratings));
    // Prints:
    // [3.14, 2.5, 1.7]

    /*
     * to accomplish the same reult in ArrayLists, we use the set() method instead:
     */

    shoppingCart.set(0, "Tweed Cape");
    System.out.println(shoppingCart);
    // Prints:
    // [Tweed Cape, Tweed Houndstooth Hat, Magnifying Glass]

    /*
     * ----------------
     * Removing an Item
     * ----------------
     * 
     * ArrayLists, unlike Arrays, allow us to remove an element at a specified index by using the remove() method:
     */

    shoppingCart.remove(1);
    System.out.println(shoppingCart);
    // Prints:
    // [Tweed Cape, Magnifying Glass]

    /*
     * Alternatively, we can remove an element by specifying the value instead:
     */

    shoppingCart.remove("Tweed Cape");
    System.out.println(shoppingCart);
    // Prints:
    // [Magnifying Glass]

    /*
     * If specifying the value instead of the index, only the first instance of the value will be removed
     */

    /*
     * -----------------------
     * Getting an Item's Index
     * -----------------------
     * 
     * We can find the index of an element within an ArrayList by using the indexOf() method:
     */

    ArrayList<String> detectives = new ArrayList<String>() {
      {
        add("Holmes");
        add("Poirot");
        add("Marple");
        add("Spade");
        add("Fletcher");
        add("Conan");
        add("Ramotswe");
      }
    };
    // Note: To initialize an ArrayList with values, we can use the above syntax
    System.out.println(detectives.indexOf("Fletcher"));
    // Prints: 4
  }
}