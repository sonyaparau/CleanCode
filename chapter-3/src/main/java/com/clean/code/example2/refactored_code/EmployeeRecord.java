package com.clean.code.example2.refactored_code;

import com.clean.code.example2.intial_code.EmployeeType;

/**
 * Class which holds useful information of an Employee.
 *
 * @author Sonya
 */
public class EmployeeRecord {

    private EmployeeType type;

    /**
     * Default constructor
     */
    public EmployeeRecord() {
        // empty constructor
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EmployeeRecord{" +
                "type=" + type +
                '}';
    }
}
