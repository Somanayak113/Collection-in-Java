//write a program to traverse(or iterate) Arraylist
package com.code;
import java.util.ArrayList;
public class TraverseArrayList 
{
  public static void main(String[] args) 
  {
    // Creating an array list
    ArrayList<String> colors = new ArrayList<>();
    colors.add("Red");
    colors.add("Pink");
    colors.add("White");
    colors.add("Green");
    colors.add("Yellow");
    colors.add("Blue");
    
    //print arraylist
    System.out.println("ArrayList: " + colors);

    // Using a for loop to iterate through the ArrayList
    System.out.println("Iterating through the ArrayList: ");
    for (int i = 0; i < colors.size(); i++) 
    {
    	//elements of the ArrayList are accessed using the get() method
    	System.out.println(colors.get(i));
    }
  }
}