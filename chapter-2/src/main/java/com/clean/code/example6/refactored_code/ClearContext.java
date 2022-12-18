package com.clean.code.example6.refactored_code;

/**
 * Example were the variables have a context. The improvement of context also allows the algorithm to be made much
 * cleaner by breaking it into smaller functions.
 *
 * @author Sonya
 */
public class ClearContext {

    private static final String PLURAL_VERB = "are";
    private static final String PLURAL_TERMINATION = "s";

    private String number;
    private String verb;
    private String pluralModifier;

    /**
     * Prints the statistics about the given character based on the number of
     * occurrences.
     *
     * @param candidate a given character
     * @param count     number of occurrences for the given character
     */
    public String make(final char candidate, final int count) {
        createPluralDependentMessageParts(count);
        return String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
    }

    private void createPluralDependentMessageParts(final int count) {
        if (count == 0) {
            thereAreNoLetters();
        } else if (count == 1) {
            thereIsOneLetter();
        } else {
            thereAreManyLetters(count);
        }
    }

    private void thereAreManyLetters(final int count) {
        number = Integer.toString(count);
        verb = "are";
        pluralModifier = "s";
    }

    private void thereIsOneLetter() {
        number = "1";
        verb = "is";
        pluralModifier = "";
    }

    private void thereAreNoLetters() {
        number = "no";
        verb = PLURAL_VERB;
        pluralModifier = PLURAL_TERMINATION;
    }
}
