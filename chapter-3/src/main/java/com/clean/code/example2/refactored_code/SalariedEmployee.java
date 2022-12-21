package com.clean.code.example2.refactored_code;

import com.clean.code.example2.common.Money;

/**
 * Salaried Employee class.
 *
 * @author Sonya
 */
public class SalariedEmployee extends Employee {

    public boolean isPayDay() {
        return false;
    }

    public Money calculatePay() {
        return new Money(1200L);
    }

    public void deliverPay(final Money pay) {

    }
}
