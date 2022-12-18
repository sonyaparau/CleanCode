package com.clean.code.example3.intial_code;

import java.util.Date;

/**
 * An example of a class having unpronounceable names.
 * If the names require a comment to understand their meaning, then the names are not well chosen.
 * If a new developer comes in the project, the variables have to be explained to him resulting in time loss and
 * unnecessary complexity.
 *
 * @author Sonya
 */
public class DtaRcrd102 {

    // generation date, year, month, day, hour, minute, second
    private Date genymdhms;

    // modification date, year, month, day, hour, minute, second
    private Date modymdhms;

    // the Id of the record
    private final String pszqint = "102";
}
