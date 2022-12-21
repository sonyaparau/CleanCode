package com.clean.code.example2.refactored_code;

import com.clean.code.example2.common.Money;

/**
 * Hourly Employee class.
 *
 * @author Sonya
 */
public class HourlyEmployee extends Employee {

    public boolean isPayDay() {
        return false;
    }

    public Money calculatePay() {
        return new Money(2100L);
    }

    public void deliverPay(final Money pay) {

    }
}
