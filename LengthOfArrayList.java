//write a program to find the length of the arraylist.
package com.code;
import java.util.ArrayList;
public class LengthOfArrayList
{
    public static void main(String[] args) 
    {
        // Create an ArrayList of Fruits
        ArrayList<String> fruitsList = new ArrayList<>();

        // Add elements to the ArrayList
        fruitsList.add("Mango");
        fruitsList.add("Apple");
        fruitsList.add("Guava");
        fruitsList.add("Banana");
        fruitsList.add("Grapes");

        // Find the length of the ArrayList
        int length = fruitsList.size();

        // Print the length of the Arraylist
        System.out.println("The length of the ArrayList is: " + length);
    }
}


