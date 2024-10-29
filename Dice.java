// Liam Andres
// 10-29-24
// Dice program - a good example of methods

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        
        
        /* debugging section
        Random rand = new Random(88);
        int randNum = rand.nextInt(6) + 1; // Random number between 1 and 6 (inclusive)
        System.out.println(randNum);
        
        int randNum2 = rand.nextInt(6) + 1; // Random number between 1 and 6 (inclusive)
        System.out.println(randNum2);
    	*/
        
        
        displayRules();							// show dice game rules
        System.out.println();
        
        int die01 = rollDie();					// roll the first die
        System.out.println("Roll 1: " + die01);
        
        int die02 = rollDie();					// roll the second die
        System.out.println("Roll 2: " + die02);
        
        System.out.println("For a grand total of " + (die01 + die02));	// print the total
        
        // debugging section
        // die01 = 3;
        // die02 = 3;
        
        boolean rollDoubles = checkForDoubles(die01, die02);    // check for doubles
        
        if(rollDoubles) {
        	System.out.println("You rolled double " + die01 + "s!");
        }
        
        System.out.println();
        
        int die03 = rollSpecial(12);			// rolling special dice
        int die04 = rollSpecial(20);
        int die05 = rollSpecial(120);
        
        System.out.println("D-12: " + die03);
        System.out.println("D-20: " + die04);
        System.out.println("D-120: " + die05);

        System.out.println();
        
        int dice = rollDice(2, 20);						// rolling multiple dice and getting the total
        System.out.println("The total is: " + dice);
        
    }
    
    // Method that takes two parameters (number of dice to roll and number of sides)
    public static int rollDice(int numOfDice, int sides) {
    
        int total = 0;
        int counter = 0;
        
        while (counter < numOfDice) {
            total += rollSpecial(sides);
            counter++;
        }
        
        if (total == 42) {
            System.out.println("WINNER!!!!!");
        }
    
        return total;
        
    }
    
    // Method that takes a parameter (number of sides) and returns a value
    public static int rollSpecial(int sides) {

        Random rand = new Random();
        return rand.nextInt(sides) + 1;
        
    }
    
    // Method that takes no parameters and returns a value
    public static int rollDie() {
        
        Random rand = new Random();
        return rand.nextInt(6) + 1;
        
    }
    
    // Method that takes no parameters and returns no value
    public static void displayRules() {
            
        System.out.println("\nRoll one die");
        System.out.println("Roll another die");
        System.out.println("Add the two together");
        System.out.println("That's your score!");
        System.out.println("The highest score wins!");
        
    }
    
    // Method that takes two parameters (dice rolls) and returns true if doubles
    public static boolean checkForDoubles(int d1, int d2) {
    	
    	if(d1 == d2) {
    		return true;
    	} else {
    		return false;
    	}
    	
    	// return d1 == d2; 	// shorter
    }
    
}