package com.clean.code.example6.intial_code;

/**
 * Example of variables with unclear context.
 * The method printGuessStatistics is a bit too long and the variables are used throughout. The context is unclear.
 *
 * @author Sonya
 */
public class UnclearContext {

    /**
     * Output:
     * There are no as
     * There is 1 b
     * There are 5 cs
     */
    public static void main(String[] args) {
        printGuessStatistics('a', 0);
        printGuessStatistics('b', 1);
        printGuessStatistics('c', 5);
    }

    /**
     * Prints the statistics about the given character based on the number of
     * occurrences.
     *
     * @param candidate a given character
     * @param count     number of occurrences for the given character
     */
    private static void printGuessStatistics(char candidate, int count) {
        String number;
        String verb;
        String pluralModifier;

        if (count == 0) {
            number = "no";
            verb = "are";
            pluralModifier = "s";
        } else if (count == 1) {
            number = "1";
            verb = "is";
            pluralModifier = "";
        } else {
            number = Integer.toString(count);
            verb = "are";
            pluralModifier = "s";
        }
        String guessMessage = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
        System.out.println(guessMessage);
    }
}
