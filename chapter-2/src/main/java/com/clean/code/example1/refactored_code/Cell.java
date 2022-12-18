package com.clean.code.example1.refactored_code;

/**
 * Cell class.
 *
 * @author Sonya
 */
public class Cell {

    private boolean isFlagged;

    /**
     * Default constructor
     */
    public Cell() {
        // default empty constructor
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public void setFlagged(boolean flagged) {
        isFlagged = flagged;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "isFlagged=" + isFlagged +
                '}';
    }
}
