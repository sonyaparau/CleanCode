package com.clean.code.example2.intial_code;

import com.clean.code.example2.common.InvalidEmployeeType;
import com.clean.code.example2.common.Money;

/**
 * Class in each the salary of different user types is calculated.
 * This is a bad example of using switch statements.
 *
 * @author Sonya
 */
public class Payroll {

    /**
     * Problems of this method:
     * - it's large and when new employee types are added, it will grow
     * - it does more than one thing
     * - it violates the Single Responsibility Principle, because there is more than one reason to change
     * - it violates the Open Closed Principle, because it must change whenever new types are added
     * - there are unlimited number of other methods that will have the same structure. E.g. isPayDay(), deliverPay()
     */
    public Money calculatePay(final Employee employee) throws InvalidEmployeeType {
        switch (employee.getType()) {
            case COMMISSIONED:
                return calculateCommissionedPay();
            case HOURLY:
                return calculateHourlyPay();
            case SALARIED:
                return calculateSalariedPay();
            default:
                throw new InvalidEmployeeType(employee.getType());
        }
    }

    private Money calculateSalariedPay() {
        return new Money(1200L);
    }

    private Money calculateHourlyPay() {
        return new Money(2100L);
    }

    private Money calculateCommissionedPay() {
        return new Money(800L);
    }
}
