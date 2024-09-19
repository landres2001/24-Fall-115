/* 
Name Liam Andres
Date 9-12-2024
Program Description Compute and output the perimeter of the square
*/

import java.util.Scanner;

public class Square {
    
    public static void main(String[] args) {
        
        findSquareStuff(); // this method gets a number from the user 
                           // and outputs the perimeter and area of the square
        
    }
    
    // this method gets a number from the user,
    // calculates the perimeter and area of the square, and outputs them
    public static void findSquareStuff() {
    	
    	// Instantiate a Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for side length and store the input in the variable length
        System.out.println("Enter the length:");
        double length = scanner.nextDouble();

                
        ///////////////////////    INSERT YOUR CODE BELOW THIS LINE    ///////////////////////
          
        //create variables that store the equations for perimeter and area

        double perimeter = 4 * length;
        double area = length * length;

        System.out.println();
        System.out.println("The perimeter of the square is " + perimeter);
        System.out.println("The area of the square is " + area);
        
        ///////////////////////    INSERT YOUR CODE ABOVE THIS LINE    /////////////////////// 
        scanner.close();  
    }
}

/*
Where did you struggle with this coding work?

What was easy?

What questions do you still have?
*/