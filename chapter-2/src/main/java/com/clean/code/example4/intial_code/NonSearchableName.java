package com.clean.code.example4.intial_code;

/**
 * What does 45 or 5 mean? When we take the look over this code, we can't understand its scope. We should extract
 * the numeric values in a meaningful constant no only to find it easily in the code, but also to make the code easier
 * to understand.
 *
 * @author Sonya
 */
public class NonSearchableName {

    public void doSomeMath() {
        final int[] t = new int[35];
        long s = 0;
        for (int j = 0; j < 34; j++) {
            s += (t[j] * 4) / 5;
        }
    }
}
