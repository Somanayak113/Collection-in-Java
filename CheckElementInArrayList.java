//Given an element write a program to check if element(value) exists in ArrayList

package com.code;
import java.util.ArrayList;
public class CheckElementInArrayList 
{
    public static void main(String[] args) 
    {
    	// Create an ArrayList of months
        ArrayList<String> months = new ArrayList<>();
        
        // Add elements to the ArrayList
        months.add("January");
        months.add("February");
        months.add("May");
        months.add("June");
        months.add("December");

        // contains() is used to check whether the specified element exists in the ArrayList 
        if (months.contains("September"))
        {
            System.out.println("September is in the arraylist");
        } 
        else 
        {
            System.out.println("September is not in the arraylist");
        }
    }
}