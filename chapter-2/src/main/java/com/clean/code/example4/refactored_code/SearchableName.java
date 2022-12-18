package com.clean.code.example4.refactored_code;

/**
 * Now it is easier to find WORK_DAYS_PER_WEEK than to find all the places where 5 was used and filter the list down
 * to just the instances with the intended naming.
 *
 * @author Sonya
 */
public class SearchableName {

    private static final int WORK_DAYS_PER_WEEK = 5;
    private static final int NUMBER_OF_TASKS = 34;

    private int estimateWorkload() {
        final int[] taskEstimate = new int[NUMBER_OF_TASKS];
        final int realDaysPerIdealDay = 4;

        int sum = 0;
        for (int j = 0; j < NUMBER_OF_TASKS; j++) {
            final int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            final int realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }

        return sum;
    }
}
