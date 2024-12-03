// Liam Andres
// 12-3-24
// All about arrays 

public class ArrayNotes {
    public static void main(String[] args) {
      
      
        /* template
        
              0   1   2   3   4   5   6
            -----------------------------
            | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
            -----------------------------
        */ 

        // Array Rules:

        // 1. You need to know the size of the array when you declare it
        // 2. Once the size is set, it can't change (you can't resize an array)
        // 3. Arrays can hold only one type of data (all ints, all Strings, etc.)
        // 4. Arrays are indexed from 0 to length - 1 (ArrayIndexOutOfBounds error)


        // Let's make an array to hold daily temperatures for a week

        int[] temps = new int[7];  // DECLARE the array and set the length (using [])

        /* 
        
              0   1   2   3   4   5   6       // positions 0 to length - 1
            -----------------------------
            | 0 | 0 | 0 | 0 | 0 | 0 | 0 |     // initially filled with 0s
            -----------------------------
        */

        // loading the array with values
        temps[0] = 29;
        temps[1] = 31;
        temps[2] = 41;
        temps[3] = 16;
        temps[4] = 30;
        temps[5] = 30;
        temps[6] = 30;


         /* 
        
              0    1    2    3    4    5    6       
            ------------------------------------
            | 29 | 31 | 41 | 16 | 30 | 30 | 30 |     
            ------------------------------------
        */

        // Can do anything with array elements that you can do with regular variables
        // print, do math, etc.

        System.out.println(temps[3]);  //16

        double weekendAverage =  (temps[0] + temps[1]) / 2.0;
        System.out.println(weekendAverage);  // 30.0

        temps[3] = 26;   // no output, just changed a value


        /* 
        
              0    1    2    3    4    5    6       
            ------------------------------------
            | 29 | 31 | 41 | 26 | 30 | 30 | 30 |     
            ------------------------------------
        */

        System.out.println(temps[3]);  // 26

        // print the first element in any array: position 0
        System.out.println("First: " + temps[0]);

        // print the last element in THIS array: position 6 (seventh element)
        System.out.println("Seventh: " + temps[6]);

        // position 7?
        //System.out.println(temps[7]);  // ArrayIndexOutOfBounds Exception

        // print the last element in any array? position length - 1
        System.out.println("Last: " + temps[temps.length - 1]);

        // How to print entire array?

        System.out.println(temps); // prints memory address

        // use a for loop to print every element in array

        for(int i = 0; i < temps.length; i++) {
            System.out.print(temps[i] + " ");
        }

        System.out.println(); // so the next thing prints on the next line

        // sending an array as a parameter to a method
        printArray(temps);
       

    }

    // This method takes an array and prints out the contents
    // Note: If you send an array as a parameter to a method, and you change the array inside the 
    // method, then the changes will "stick" when the method is done

    public static void printArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

    }


}