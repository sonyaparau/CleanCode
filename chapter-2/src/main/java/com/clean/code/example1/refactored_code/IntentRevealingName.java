package com.clean.code.example1.refactored_code;

import java.util.ArrayList;
import java.util.List;

/**
 * In the refactored code, the simplicity of the code has not changed. It still has the same number of operators, with
 * exactly the same number of nesting levels. But the code has become much more explicit.
 * <p>
 * It ca be considered for example as a game board with a given number of cells. A cell is considered to be flagged, if
 * it has the value 4. Thus, the code is improved considerably.
 *
 * @author Sonya
 */
public class IntentRevealingName {

    private final List<Cell> gameBoard = new ArrayList<Cell>();

    /**
     * Get all the flagged cells of a game board.
     *
     * @return list of flagged cells
     */
    public List<Cell> getFlaggedCells() {
        final List<Cell> flaggedCells = new ArrayList<Cell>();

        for (final Cell cell : gameBoard) {
            if (cell.isFlagged()) {
                flaggedCells.add(cell);
            }
        }

        return flaggedCells;
    }
}
