package com.clean.code.example2.refactored_code;

import com.clean.code.example2.common.InvalidEmployeeType;

/**
 * Handles the creation of new employees based on their types.
 *
 * @author Sonya
 */
public interface EmployeeFactory {

    /**
     * Creates a new employee.
     *
     * @param record contains the necessary data for creating a new employee type
     * @return the created {@link Employee}
     */
    Employee makeEmployee(final EmployeeRecord record) throws InvalidEmployeeType;
}
