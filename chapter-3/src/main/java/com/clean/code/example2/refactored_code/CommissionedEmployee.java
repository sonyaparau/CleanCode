package com.clean.code.example2.refactored_code;

import com.clean.code.example2.common.Money;

/**
 * Commissioned Employee class.
 *
 * @author Sonya
 */
public class CommissionedEmployee extends Employee {

    public boolean isPayDay() {
        return false;
    }

    public Money calculatePay() {
        return new Money(800L);
    }

    public void deliverPay(final Money pay) {

    }
}
