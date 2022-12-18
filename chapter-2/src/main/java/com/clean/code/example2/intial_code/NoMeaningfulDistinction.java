package com.clean.code.example2.intial_code;

/**
 * Noninformative variables - a1, a2, ...., an provide no clue to the author's intention.
 *
 * @author Sonya
 */
public class NoMeaningfulDistinction {

    public static void copyChars(char[] a1, char[] a2) {
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
    }
}
