package sca.assignment;
/**
 *
 * @author TILDA
 */
public class SCAAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Loops are used to create programs that should keep executing till a condition is met.
         * There are three(3) types of loops in Java
         * 1. for loops
         * 2. do while
         * 3. while
         *
         * for loops:
         * for(initialization; condition; increment/decrement){
         * statement(s)
         * }
         *
         * when a for loop program is written, the compiler goes into the condition, and keeps executing the program till the condition is met
         *
         * */
        for (int i = 0; i <= 200; i++) System.out.println(i);

        int total = 0;
        for (int i = 0; i <= 10; i++) total += i;

        System.out.println( "The sum of the first 10 natural numbers is " + total);

        /*Infinite Loops
         * Infinite loops are loops that runs forever, excepte we kill the program, they are mostly
         * made by writing a condition which can never be met.
         * */
        //for example
        //you can uncomment this to run by pressing ctrl + / after highlighting
//        for (int i=0; i > -4; i++ ){
//            System.out.println("Hy");
//        }
        /*So the expression above is going to print  "Hy" forever because the condition is going to be greater than minus 4 as long as we keep incrementing
         * */
        //another basic example of for loop
        //you can uncomment this to run by pressing ctrl + / after highlighting
//        for (; ; ) {
//            System.out.println("Hello world");
//        }
        /*
         * Enhanced For loop
         * Enhanced for loop is useful when you want to iterate Array/Collections, it is easy to write and understand.
         * Let’s take the same example that we have written above and rewrite it using enhanced for loop.*/
        //comment the above codes to run this
        String scastudents[]={"Tilda","Nikki", "ChelseaQuin", "Love", "Mary"};
        for (String students : scastudents) {
            System.out.println(students);
        }
    }

}

/** An instance variable is a variable declared in a class - outside any block or method
and each instance of that class has a copy of that variable. They are also called non-static fields **/

/**A static field is a variable declared in a class but none of the instances share that variable
 with that class. They are also called class variables **/

// The 8 primitive data types in java are boolean, byte, char, short, int, long, float and double.

//Score: 10