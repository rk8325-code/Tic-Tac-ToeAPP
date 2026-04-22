/**
 * TicTacToe – UC5
 * Validates whether a move is inside the board boundaries
 * and whether the selected cell is empty.
 *
 * @author Developer Name
 * @version 5.0
 */
public class TicTacToeAPP {

    // 3x3 board initialized with empty cells
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    /**
     * Entry point of the program.
     * Tests the validation logic using sample row and column values.
     */
    public static void main(String[] args) {
        // Example test: row=1, col=1
        System.out.println("Is move valid? " + isValidMove(1, 1));
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input: Row, Column
     * Output: true if valid, false otherwise.
     */
    static boolean isValidMove(int row, int col) {
        // Check boundaries (0–2 for both row and col)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if the cell is empty
        return board[row][col] == '-';
    }
}
