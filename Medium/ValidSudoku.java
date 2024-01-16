package Medium;

import java.util.HashSet;

public class ValidSudoku {

    public static boolean isValidRow(char[][] board, int index) {
        HashSet<Character> arr = new HashSet<Character>();
        int count = 0;
        for (int i = 0; i < 9; i++) {
            if (board[index][i] != '.') {
                count++;
                arr.add(board[index][i]);
            }
        }
        return arr.size() == count;
    }

    public static boolean isValidCol(char[][] board, int index) {
        HashSet<Character> arr = new HashSet<Character>();
        int count = 0;
        for (int i = 0; i < 9; i++) {
            if (board[i][index] != '.') {
                count++;
                arr.add(board[i][index]);
            }
        }
        return arr.size() == count;
    }

    public static boolean isValidCube(char[][] board, int x0, int y0, int x1, int y1) {
        HashSet<Character> arr = new HashSet<Character>();
        int count = 0;
        for (int i = x0; i <= x1; i++) {
            for (int j = y0; j <= y1; j++) {
                if (board[i][j] != '.') {
                    count++;
                    arr.add(board[i][j]);
                }
            }
        }
        return (arr.size() == count);
    }

    public static boolean isValidSudoku(char[][] board) {
        // check the row
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i)) {
                return false;
            }
        }
        // check the column
        for (int i = 0; i < 9; i++) {
            if (!isValidCol(board, i)) {
                return false;
            }
        }
        // check each cube
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidCube(board, i, j, i + 2, j + 2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        char[][] board_true = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        char[][] board_false = {
                { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        System.out.println(isValidSudoku(board_true));
        System.out.println(isValidSudoku(board_false));
    }
}
