package com.clean.code.example2.refactored_code;

import com.clean.code.example2.common.Money;

/**
 * Abstract class for an employee.
 *
 * @author Sonya
 */
public abstract class Employee {

    /**
     * Checks if today is a pay day.
     *
     * @return true or false
     */
    public abstract boolean isPayDay();

    /**
     * Calculates the pay of an employee.
     *
     * @return the calculated pay
     */
    public abstract Money calculatePay();

    /**
     * Delieveres the given pay to the employee.
     *
     * @param pay the current pay
     */
    public abstract void deliverPay(final Money pay);
}
