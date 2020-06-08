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
        for (int i = 0; i <= 200; i++) System.out.println(i);

        int total = 0;
        for (int i = 0; i <= 10; i++) total += i;

        System.out.println( "The sum of the first 10 natural numbers is " + total);
    }
}

/** An instance variable is a variable declared in a class - outside any block or method
and each instance of that class has a copy of that variable. They are also called non-static fields **/

/**A static field is a variable declared in a class but none of the instances share that variable
 with that class. They are also called class variables **/

// The 8 primitive data types in java are boolean, byte, char, short, int, long, float and double.