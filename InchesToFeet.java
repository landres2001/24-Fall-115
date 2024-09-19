/* 
Name Liam Andres
Date 9-17-2024
Program Description: Write a program that will ask the user for a number of total inches. Then convert the total inches into feet and inches. Output the result in the exact format shown below.
*/

import java.util.Scanner;

public class InchesToFeet {
	public static void main(String[] args) {

		// All the dirty work happens in the 'convert()' method; let's call it here from the main method!
		convert();      
             
	}
   
	// this method asks the user for total inches and outputs the conversion to feet and inches
    public static void convert() {

	   // Create a new Scanner to read in input from user
	   Scanner scanner = new Scanner(System.in);
      
       // Prompt the user and then store their input in 'totalInches'
       System.out.println("Enter the number of inches:");
       int totalInches = scanner.nextInt();

       // Convert to feet and inches. 
	   // ex. if totalInches is 38, the output would be: 38 inches is 3 feet, and 2 inches

       ///////////////////////    INSERT YOUR CODE BELOW THIS LINE    ///////////////////////

       //set feet equal to the whole number (without the remainder)
        int feet = totalInches / 12;

        //find remaining inches (if any) by modulus division of total inches
        int inches = totalInches % 12;

        System.out.println();
        System.out.println(totalInches + " inches is " + feet + " feet, and " + inches + " inches");

	    
	    
       
       
       
       ///////////////////////    INSERT YOUR CODE ABOVE THIS LINE    ///////////////////////

       scanner.close();   

   }

}

/*
Where did you struggle with this coding work?

What was easy?

What questions do you still have?
*/