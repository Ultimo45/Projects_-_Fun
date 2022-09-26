/*

 * Created by Seth Clark
 * Quadratic Formula Calculator

 */

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // valA value //
        System.out.println("Please enter a value for 'a': ");
        int valA = reader.nextInt();
        if (valA == 0 || valA < 0) {
            System.out.println("That's not a positive integer that also isn't 0. Please restart the program.");
            System.exit(0);
        }

        // valB value //
        System.out.println("Please enter a value for 'b': ");
        int valB = reader.nextInt();
        if (valB == 0 || valB < 0) {
            System.out.println("That's not a positive integer that also isn't 0. Please restart the program.");
            System.exit(0);
        }

        // valC value //
        System.out.println("Please enter a value for 'c': ");
        int valC = reader.nextInt();
        if (valC == 0 || valC < 0) {
            System.out.println("That's not a positive integer that also isn't 0. Please restart the program.");
            System.exit(0);
        }

        // calculation of - side of Quadratic Formula //
        double q_formula_addition = ((-valB + (Math.sqrt(Math.pow(valB, 2) - 4 * valA * valC))) / (2 * valA));

        // calculation of - side of Quadratic Formula //
        double q_formula_subtraction = ((-valB - (Math.sqrt(Math.pow(valB, 2) - 4 * valA * valC))) / (2 * valA));

        // final output of solutions //
        System.out.printf("\nThe first solution for x is: %.2f, and the second solution for x is: %.2f.",
                q_formula_addition, q_formula_subtraction);

    } // end of main //

} // end of class //
