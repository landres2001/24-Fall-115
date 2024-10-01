//Liam Andres
//10/1/2024
//Efficiently using if/else statements and multiple conditionals

import java.util.Scanner;

public class MoreIfs {
    public static void main(String[] args){
        betterIfs(); // efficiently use if/else statements
        multipleIfs(); // a look at ways to handle multiple conditionals
    }
    
    //This method shows the preferred way to handle code that is being reused
    public static void betterIfs(){
        //When you have code that ends up being reused in your program:
        //This is the preferred way:

         Scanner sc = new Scanner(System.in);
         System.out.println("What is your age?");

         int age = sc.nextInt();

         if(age >= 65){
             System.out.println("Age is just a number!");
         }

         System.out.println(age + " is a good age.");

         sc.close();


         //this is less preferred:

        // Scanner scan = new Scanner(System.in);
        // System.out.println("What is your age?");

        // int age2 = scan.nextInt();

        // if(age >= 65) {
        //     System.out.println("Age is just a number!");
        //     System.out.println(age2 + " is a good age.");
        // }

        // if(age < 65) {
        //     System.out.println(age2 + " is a good age.");
        // }
        //     scan.close();

    }

    public static void multipleIfs(){
        //let's compare num to 10 in a better way than we did before
        //multiple ways to handle multiple conditionals

        //only one outcome possible
        //NESTED
        //note the indentations: every { --> the next line indented

            int num = 42;

            if(num > 10){
                System.out.println("num is greater!");
            } else {
                if(num < 10) {
                    System.out.println("num is less!");
                } else {
                    System.out.println("num is equal!");
                }
            }

            //same as above, but with neater nesting
            if(num > 10){
                System.out.println("num is greater!");
            } else if(num < 10) {
                System.out.println("num is less!");
            } else {
                System.out.println("num is equal!");
            }

            // more than one outcome possible
            //not nested
            num = 101;
            if(num > 10){
                System.out.println("num is greater!");
            }
            if(num > 100){
                System.out.println("really big number!");
            }

            num = 42;

            // boolean logic operator AND  --> short-circuit
             if(num >= 40 && num <= 60){
                System.out.println("Num is in range!");
             }


             // boolean logic operator OR   --> short-circuit
             if(num >= 40 || num <= 10) {
                System.out.println("You win!");
             }

    }


    //Another option: SWITCH STATEMENTS
    //Textbook 6.3

    //Pros and Cons:
    // if/else can handle ranges
    // switch statements can only handle exact values
    // switch statements can only be used with certain primitives and String
    // if/else statements can get messy with {} , more prone to errors (BOTH syntax and logic)

}
