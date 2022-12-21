package com.clean.code.example2.intial_code;

/**
 * Employee class.
 *
 * @author Sonya
 */
public class Employee {

    private EmployeeType type;

    /**
     * Default constructor.
     */
    public Employee() {
        // default empty constructor
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "type=" + type +
                '}';
    }
}
