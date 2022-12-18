package com.clean.code.example1.initial_code;

import java.util.ArrayList;
import java.util.List;

/**
 * A code snipped that is hard to understand. Although there are no complex expressions, the problem is with the
 * implicit of the code. Some questions can be addressed to this code:
 * 1. What kind of things are in theList?
 * 2. What is the significance of the zeroth subscript of an item in theList?
 * 3. What is the significance of the value 4?
 * 4. How would I use the list being returned?
 *
 * @author Sonya
 */
public class NoIntentRevealingName {

    private final List<int[]> theList = new ArrayList<int[]>();

    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }
}
