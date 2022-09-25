/* Created by Seth Clark
 * Fermat Theorem Test
 */

import java.util.Random;

public class Fermat {
  public static void main(String args[]) {
    Random randomA = new Random();
    int varrA = randomA.nextInt(10) + 1;
    Random randomB = new Random();
    int varrB = randomB.nextInt(10) + 1;
    Random randomC = new Random();
    int varrC = randomC.nextInt(10) + 1;
    // comment out following Random and try either 1 or 2 to test theorem
    // int varrN = 1;
    Random randomN = new Random();
    int varrN = randomN.nextInt(10) + 1;

    double finalA = Math.pow(varrA, varrN);
    double finalB = Math.pow(varrB, varrN);
    double finalC = Math.pow(varrC, varrN);

    boolean Fermat_theorem = (finalA + finalB == finalC);

    /*
     * if statement that checks if varrN is greater than 2. If it is, it tests
     * to see if Fermat's theorem could be proved wrong. If it's two or less it
     * tests
     * to see of the answer is true. If it is, it says Fermat was right and if
     * it isn't it asks you to try again.
     */

    if (varrN > 2) {
      if (Fermat_theorem == true) {
        System.out.println("Holy smokes, Fermat was wrong!");
      } else {
        System.out.println("No, that doesn't work. Try again.");
      } // end of if
    } else {
      if (Fermat_theorem == true) {
        System.out.println("Holy smokes, Fermat was right!");
      } else {
        System.out.println("Nothing to see here. Try again.");
      }
    } // end of else

  } // end of main

} // end of class
