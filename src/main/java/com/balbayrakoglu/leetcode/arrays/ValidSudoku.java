package com.balbayrakoglu.leetcode.arrays;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) {
            throw new IllegalArgumentException("Board must be 9x9");
        }

        boolean[][] rowUsed = new boolean[9][10];
        boolean[][] colUsed = new boolean[9][10];
        boolean[][] boxUsed = new boolean[9][10];

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char ch = board[row][col];

                if (ch == '.') {
                    continue;
                }

                int digit = ch - '0';
                if (digit < 1 || digit > 9) {
                    return false;
                }

                int boxIndex = (row / 3) * 3 + (col / 3);

                if (rowUsed[row][digit] || colUsed[col][digit] || boxUsed[boxIndex][digit]) {
                    return false;
                }
                rowUsed[row][digit] = true;
                colUsed[col][digit] = true;
                boxUsed[boxIndex][digit] = true;

            }
        }

        return Boolean.TRUE;
    }
}
