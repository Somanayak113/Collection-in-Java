//write a program to remove element from specifies index of arraylist

package com.code;
import java.util.ArrayList;
public class RemoveElementArrayList 
{
	public static void main(String[] arg)
	{

		// creating an ArrayList of flowers
		ArrayList<String> flowerList = new ArrayList<String>();

		// Add elements to the ArrayList 
		flowerList.add("Rose");
		flowerList.add("Sunflower");
		flowerList.add("Jasmin");
		flowerList.add("Lotus");
		flowerList.add("Marigold");

		// Display the ArrayList before removal
        System.out.println("ArrayList before removal: " + flowerList);

        // Specify the index of the element to be removed
	    flowerList.remove(2); 
	    
	    // Showing all the elements in the ArrayList after removal
		System.out.println("ArrayList after removal: " + flowerList);
	}  
}

