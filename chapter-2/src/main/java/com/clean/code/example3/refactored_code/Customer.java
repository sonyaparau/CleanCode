package com.clean.code.example3.refactored_code;

import com.clean.code.example3.intial_code.DtaRcrd102;

import java.util.Date;

/**
 * Rewrite the class {@link DtaRcrd102} to be more understandable.
 * Now, the variable names need no more comments to understand their meaning.
 *
 * @author Sonya
 */
public class Customer {

    private final String recordId = "102";

    private Date generationTimestamp;

    private Date modificationTimestamp;
}
