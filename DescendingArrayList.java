//write a program to sort Arraylist in descending order

package com.code;
import java.util.ArrayList;
import java.util.Collections; 
public class DescendingArrayList 
{ 
	public static void main(String args[]) 
	{ 

		// Create an ArrayList 
		ArrayList<String> list = new ArrayList<String>(); 

		// Add elements to the ArrayList 
		list.add("Bottle"); 
		list.add("Scale"); 
		list.add("Book"); 
		list.add("Pen"); 
		list.add("Box"); 

		// Print the unsorted ArrayList 
		System.out.println("Unsorted ArrayList: "+ list); 

		//Collections.reverseOrder() method is used as a comparator to reverse the natural ordering
		Collections.sort(list, Collections.reverseOrder()); 

		// Print the sorted ArrayList 
		System.out.println("Sorted ArrayList in Descending order : "+ list); 
	} 
} 
