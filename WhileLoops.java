//Liam Andres
//10/17/2024
//All about while loops

public class WhileLoops {
    public static void main(String[] args){

        loops(); //while loops
    }

    //This method looks at while loops
    public static void loops(){
        //Ask a question one time: if-statement
        //Ask a question repeatedly (or do something repeatedly): loop (while)

        //LOOP RULES:

       // When you program a loop, you should know that it will 
       // DEFINITELY end once some condition has occurred 

       // Usually you have to increment some variable 
       // so that the loop will approach the end state
       // LCV (loop control variable)

       // WAYS TO INCREMENT A VARIABLE (3.7 in textbook)

       int count = 0;

       //how do I add 1?
       count = count + 1; //this adds 1 and saves the updated value to count
       count += 1; //compound operator (shortcut)
       count++; //another common way to increment by 1

       //one more note: use curly braces {} around the while loop code!

       //HERE COMES A LOOP!

       int counter = 0;
       
       while(counter != 5){
        System.out.println(counter);
        counter += 1; //increment (get the counter to 5 and allow the while loop to end)
       } //this loop runs 5 times. You can adjust the start/end/increment values, can use <, > etc...

       int num = 0;
       while(num < 3){
        System.out.println(num);
       }

       //INFINITE LOOP OF DOOM!!!!! (needs an incrementor)
       //ctrl + z to escape/break the loop in the terminal

       //Live Code Demos in Brightspace

    }
}
