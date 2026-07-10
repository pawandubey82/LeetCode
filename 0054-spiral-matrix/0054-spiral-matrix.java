class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int startingRow = 0;
        int endingRow = m-1;
        int startingCol = 0;
        int endingCol = n-1;

        while(startingRow<= endingRow && startingCol <= endingCol){
            // Row wise left to right print starting row, starting col to end col
            for( int col = startingCol; col<=endingCol;col++){
                result.add(matrix[startingRow][col]);
            }
            startingRow++;
            // col Wise top to bottom print ending col, starting row to end row
            for( int row = startingRow; row<= endingRow; row++){
                result.add(matrix[row][endingCol]);
            } 
            endingCol--;
            // Row wise right to left print ending row, end col to start col
            if(startingRow <= endingRow){
                for(int col = endingCol; col>= startingCol;col--){
                result.add(matrix[endingRow][col]);
                 }
            endingRow--;
            }
            // Col wise bottom to top print starting col, end row to start row
            if(startingCol<= endingCol){
                 for(int row = endingRow; row>= startingRow;row--){
                result.add(matrix[row][startingCol]);
            }
            startingCol++;
            }
        }

        return result;
    }
}