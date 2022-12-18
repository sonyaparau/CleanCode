package com.clean.code.example2.refactored_code;

/**
 * Noninformative variables should be replace for a better understanding. E.g. the function reads much better when
 * "source" and "destination" are used for the argument names.
 *
 * @author Sonya
 */
public class MeaningfulDistinction {

    public static void copyChars(final char[] source, final char[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }
}
