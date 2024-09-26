//Liam Andres
// 9-26-2024
//Notes for using if/else statements

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        ifMethod();

    }

    //method to study if and else statements
    public static void ifMethod(){

        //Task: ask the user for a number and tell them
        // if it's even

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: "); //prompts the user for a number

        int number = sc.nextInt(); //read and store number

        //Three common mistakes:
        // 1. DON'T put a ; after the if()
        // 2. DO put curly braces { } around the code to be executed if true
        // 3. DO remember to test for equality with '=='

        //test for evenness using modulus (mod for short)
        if(number % 2 == 0){
            System.out.println(number + " is even.");
            System.out.println("Rock on!!");
        }

        System.out.println("The end."); //prints every time

        // Task: compare two numbers

        int num1 = 21;
        int num2 = 7;

        // compare and output a message
        if(num1 < num2){
            System.out.println("num1 is less!");
        }
        else {
            System.out.println("num1 is NOT less!");
        }

        sc.close();
    }

}
