//Liam Andres
// 9-19-2024
//How to use a scanner to read user input from the keyboard

// To read from the keyboard, we use the premade Scanner class in Java
// Certain premade classes need to be imported to be used
// Math and String: no import
// Scanner: import


import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args){
        readInput(); //read the input from the keyboard method below.
    }

    // a method that will look at reading input from the keyboard
    public static void readInput(){

        String name;
        int age;

        // INSTANTIATE (create) a Scanner that reads from the keyboard
        Scanner sc = new Scanner(System.in);

        // prompt the user for information
        // use .nextLine() method to read and store text
        System.out.println("What is your full name?");
        name = sc.nextLine(); // reads in the line of text and stores it to name

        // Scanners have methods to read in the next piece of data until there is a space or a new line
        // To read and store and int, use .nextInt()

        System.out.println("What is your age?");
        age = sc.nextInt();

        System.out.println("Hello, " + name + ". How does it feel to be " + age + "?");

        sc.close(); // closes the Scanner (and makes the compiler happy :] )

    }
}