package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidSudokuTest {

    private final ValidSudoku validator = new ValidSudoku();


    @Test
    void isValidSudoku_validBoard() {
        char[][] board = {
                {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };


        assertTrue(validator.isValidSudoku(board));
    }


    @Test
    void isValidSudoku_invalidRowDuplicate() {
        char[][] board = {
                {'5', '3', '3', '.', '7', '.', '.', '.', '.'}, // 3 duplicated in row
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };


        assertFalse(validator.isValidSudoku(board));
    }

}