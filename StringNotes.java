//Liam Andres
//10/3/2024
//Notes on Strings

public class StringNotes {
    public static void main(String[] args){
        stringThings(); //some things we can do with Strings
    }

    //method to look at some things we can do with Strings
    public static void stringThings(){
        /*
         * primitives (int, double, etc.)
         * vs. objects/classes (Scanner, Math, String) (Ch.4)
         * 
         * objects have methods that can do things
         * ex. sc.nextInt(), Math.round(num)
         * 
         * We've used Strings like primitives, but
         * they can do so much more!
         */

         String name = "Grace";
         System.out.println("name = " + name); // name = Grace

         System.out.println(); //prints blank line

         // length() return (gives) the length of the String
         //by the number of characters it contains

         System.out.println(name.length()); // 5

         System.out.println();

         //Strings are indexed from 0 to the length of the string -1

         //charAt(position) return the character at
         // the specified index

         System.out.println(name.charAt(0)); //G
         System.out.println(name.charAt(4)); //E
         //System.out.println(name.charAt(5)); //out of bounds

         System.out.println();

         // lots of methods to help standardize the users input

         // toUpperCase() returns the String in all UPPERCASE LETTERS
         System.out.println(name.toUpperCase()); //GRACE

         // toLowerCase() returns the String in all lowercase letters
         System.out.println(name.toLowerCase()); //grace

         // trim gets rid of leading and trailing whitespace
         name = "                                                            Grace                                                                                                                  ";
         System.out.println(name);
         System.out.println(name.trim()); //Grace

         //to actually change the String, reassign with the = operator

         //name = name.trim();
         name = name.toUpperCase().trim(); // "dot stacking" or "chaining"

         System.out.println(name); //GRACE

         System.out.println();

         String s1 = "Star Trek";
         String s2 = "Star Wars";

        // substring(position) returns a part of the String starting at the
        //number you give it through the end.
        System.out.println(s1.substring(5)); //Trek

        //substring(start, end) return a part of the String
        //from start to end - 1 (the end is not included)
        System.out.println(s2.substring(5,9)); //Wars

        System.out.println();

        System.out.println(s1.equals(s2)); // False
        System.out.println(s1.equals(s1)); // True

        String s3 = "STAR TREK";

        System.out.println(s1.equalsIgnoreCase(s3)); // true

    }
}
