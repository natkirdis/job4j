package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            boolean cells = true;
            boolean rows = true;
            for (int cell = 0; cell < board.length; cell++) {
                cells &= (board[cell][row] == 'X');
                rows &= (board[row][cell] == 'X');
            }
            if (cells || rows) {
                result = true;
            }
        }
        return result;
    }
}