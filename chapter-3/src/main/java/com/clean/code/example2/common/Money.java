package com.clean.code.example2.common;

/**
 * Money class used to calculate the salaries of the employees.
 *
 * @author Sonya
 */
public class Money {

    private Long value;

    /**
     * Constructor with parameters.
     *
     * @param value the salary value
     */
    public Money(final Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Money{" +
                "value=" + value +
                '}';
    }
}
