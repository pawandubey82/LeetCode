class Solution {

    static boolean findEmptyCell(char[][] board, int[] emptyCell){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    // Store empty cell ki row
                    emptyCell[0] = i;
                    emptyCell[1] = j;
                    // Store empty cell ki column
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isSafeToPlace(char[][] board, char charValue, int rowIndex, int colIndex){

        // Check for row
        for(int col = 0; col < 9; col++){
            if(board[rowIndex][col] == charValue){
                return false;
            }
        }

        // Check for column
        for(int row = 0; row < 9; row++){
            if(board[row][colIndex] == charValue){
                return false;
            }
        }

        // Check for 3*3 wala box
        int startRow = rowIndex - rowIndex % 3;
        int startCol = colIndex - colIndex % 3;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int actualRow = startRow + i;
                int actualCol = startCol + j;
                if(board[actualRow][actualCol] == charValue){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean solveSudokuHelper(char[][] board){

        int[] emptyCell = new int[2];

        if(!findEmptyCell(board, emptyCell)){
            return true;
        }

        int rowIndex = emptyCell[0];
        int colIndex = emptyCell[1];

        for(int value = 1; value <= 9; value++){

            char charValue = (char)(value + '0');

            if(isSafeToPlace(board, charValue, rowIndex, colIndex)){

                // Place the value
                board[rowIndex][colIndex] = charValue;

                if(solveSudokuHelper(board) == true){
                    return true;
                }

                // Backtracking
                board[rowIndex][colIndex] = '.';
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        solveSudokuHelper(board);
    }
}