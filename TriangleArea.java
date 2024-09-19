/* 
Name Liam Andres
Date 9/12/2024
Program Description calculate area using user input
*/

import java.util.Scanner;

public class TriangleArea {
    
    public static void main(String[] args) {
        
        findArea(); // this method gets numbers from the user and outputs the area of the triangle
        
    }
    
    // this method gets numbers from the user, calculates the area of the triangle, and outputs it
    public static void findArea() {
    	
    	// Instantiate a Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for height and store the input in the variable 'height'
        System.out.println("Enter the height:");
        int height = scanner.nextInt();

        // Prompt the user for the base and store the input in the variable 'base'        
        System.out.println("Enter the base:");
        int base = scanner.nextInt();
        
        ///////////////////////    INSERT YOUR CODE BELOW THIS LINE    ///////////////////////
        
        //store area as the calculated number of (.5*base*height)
        //print it out in a string statement with some adjoining text
        double area = 0.5*base*height;
        System.out.println();
        System.out.println("The area of the triangle is " + area);
        
        ///////////////////////    INSERT YOUR CODE ABOVE THIS LINE    /////////////////////// 
        scanner.close();  
    }
}

/*
Where did you struggle with this coding work?

What was easy?

What questions do you still have?
*/