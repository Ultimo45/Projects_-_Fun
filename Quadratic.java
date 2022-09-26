/*

 * Created by Seth Clark
 * Quadratic Formula Calculator

 */

import java.math.BigInteger;
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

        /*
         * I was getting NaN because Math.sqrt could not square root a negative. I
         * updated the code to determine if the value was negative and return
         * "no real roots" if it was. If the value is positive, then it will process
         * normally.
         */ // StackOverflow link that gave me solution:
            // https://stackoverflow.com/questions/7461803/why-quadratic-equations-root-result-is-nan-java
            //
        int discriminant = valB * valB - 4 * valA * valC;
        if (discriminant == 0 || discriminant < 0) {
            System.out.println("There are no real roots.");
        } else {
            // calculation of + side of Quadratic Formula //
            double q_formula_addition = ((-valB + (Math.sqrt(discriminant))) / (2 * valA));

            // calculation of - side of Quadratic Formula //
            double q_formula_subtraction = ((-valB - (Math.sqrt(discriminant))) / (2 * valA));

            // final output of solutions //
            System.out.printf("\nThe first root for x is: %.2f, and the second root for x is: %.2f.",
                    q_formula_addition, q_formula_subtraction);
        } // end of if/else determining if discriminant < or equal to 0 AND output of
          // solutions//

    } // end of main //

} // end of class //
