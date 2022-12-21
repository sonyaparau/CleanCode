package com.clean.code.example2.refactored_code;

import com.clean.code.example2.common.InvalidEmployeeType;

/**
 * Implementation of {@link EmployeeFactory}.
 *
 * @author Sonya
 */
public class EmployeeFactoryImpl implements EmployeeFactory {

    public Employee makeEmployee(final EmployeeRecord record) throws InvalidEmployeeType {
        switch (record.getType()) {
            case COMMISSIONED:
                return new CommissionedEmployee();
            case HOURLY:
                return new HourlyEmployee();
            case SALARIED:
                return new SalariedEmployee();
            default:
                throw new InvalidEmployeeType(record.getType());
        }
    }
}
