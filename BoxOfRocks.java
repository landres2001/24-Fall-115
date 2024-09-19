/* 
Name Liam Andres
Date 9-17-2024
Program Description : Create a program that asks a user how many rocks will be used to fill boxes. Assuming it takes 8 rocks to fill a box, on average, respond to the user with the number of boxes that will be filled and the number of rocks left over. Make sure your output is formatted as shown below.
*/

import java.util.Scanner;

public class BoxOfRocks {
	public static void main(String[] args) {

		// All the dirty work happens in the 'fillBoxes()' method; let's call it here from the main method!
		fillBoxes();      
             
	}
   
	// this method asks the user for the number of rocks 
	// and outputs the number of boxes filled and number of rocks left over
	
    public static void fillBoxes() {

	   // Create a new Scanner to read in input from user
	   Scanner scanner = new Scanner(System.in);
      
       // Prompt the user and then store their input in 'numRocks'
       System.out.println("Enter the number of rocks:");
       int numRocks = scanner.nextInt();

       // Determine the number of boxes filled and the number of rocks left over. It takes 8 rocks to fill a box. 
	   // ex. if numRocks is 26, the output would be: 
       // You will completely fill 3 boxes.
       // You will have 2 rocks left over.

       ///////////////////////    INSERT YOUR CODE BELOW THIS LINE    ///////////////////////

        //calculate the total boxes (with regular division) and calculate the remainder (with modulus division)
        int boxes = numRocks / 8;
        int leftovers = numRocks % 8;
	    System.out.println();
	    System.out.println("You will completely fill " + boxes + " boxes.");
	    System.out.println("You will have " + leftovers + " left over.");
       
       
       
       ///////////////////////    INSERT YOUR CODE ABOVE THIS LINE    ///////////////////////

       scanner.close();   

   }

}

/*
Where did you struggle with this coding work?

What was easy?

What questions do you still have?
*/