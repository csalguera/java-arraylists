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
  }
}