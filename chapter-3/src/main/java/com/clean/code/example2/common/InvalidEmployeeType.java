package com.clean.code.example2.common;

import com.clean.code.example2.intial_code.EmployeeType;

/**
 * Custom exception used to indicate invalid employee types.
 *
 * @author Sonya
 */
public class InvalidEmployeeType extends Exception {

    /**
     * Constructor of {@link InvalidEmployeeType}.
     *
     * @param type the type of the user
     */
    public InvalidEmployeeType(final EmployeeType type) {
        super(type.name());
    }
}
