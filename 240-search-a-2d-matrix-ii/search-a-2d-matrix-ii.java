class Solution {
    public boolean searchMatrix(int arr[][], int target){
        int row = 0;
        int column = arr[0].length - 1;


        while (row < arr.length && column >=0){
            if (arr[row][column] == target) return true;
            if (arr[row][column] < target) row++;
            else column--;
        }


        return false;
    }
}