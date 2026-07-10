class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new int[0][0];
        }
        // Original Array
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;
        // For new Array
        int newTotalRows = totalCols;
        int newTotalCols = totalRows;
        int ans[][] = new int[newTotalRows][newTotalCols];

        // Actual Logic
        for(int i = 0; i<totalRows;i++){
            for(int j = 0; j<totalCols; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}