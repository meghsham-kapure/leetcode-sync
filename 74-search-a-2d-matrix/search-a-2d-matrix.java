class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = searchRow(matrix, target);

        if (row == -1) return false;
        
        int foundOnColumn = searchTargetOnColumn(matrix, target, row);

        return foundOnColumn!=-1? true : false;

    }

    public int searchRow(int[][] matrix, int target){
        int start = 0;
        int end =  matrix.length - 1;

        while (start <= end ){
            int mid = start + ( end - start) / 2;

            int first = matrix[mid][0]; 
            int last = matrix[mid][matrix[mid].length-1];

            if (target >= first && target <= last){
                return mid;
            } else{
                if (target < first){
                    end = mid - 1;
                }else if (target > last) {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public int searchTargetOnColumn(int[][] matrix, int target, int row){
        int start = 0;
        int end = matrix[row].length-1;

        while (start <= end ){
            int mid = start + ( end - start) / 2;

            if (matrix[row][mid] == target){
                return mid;
            }else if (matrix[row][mid]< target){
                start = mid +1;
            }else{
                end = mid - 1; 
            }
        }

        return -1;
    }
}