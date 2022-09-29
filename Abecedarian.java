/*
 * Created by: Seth Clark
 * Abecedarian Word Check
 */

import java.util.Scanner;

public class Abecedarian {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(
                "An abecedarian word is a word who's letters appear in alphabetical order. Let's test it! Enter a word:");
        String word = in.nextLine();
        System.out.printf(
                "\nLet's check to see if %s is abecedarian!\n\n", word);
        System.out.println("True or False: Is this word abecedarian? " + isAbecedarian(word) + "!");

    } // end of main

    public static boolean isAbecedarian(String word) {

        for (int i = 0, p = 1; i < word.length() - 1; i++, p++) { // adding different variables to the for loop allowed
                                                                  // me to traverse the word while comparing two
                                                                  // different
                                                                  // characters
            char letter = word.charAt(i);
            char letter2 = word.charAt(p);
            if (letter <= letter2) { // as long as the first letter is less than or equal to (equal to because double
                                     // letters are technically still in alphabetical order) the next, it will
                                     // continue
            } else {
                return false;
            } // end of if/else conditional

        } // end of for loop

        return true;

    } // end of isAbecedarian

} // end of class