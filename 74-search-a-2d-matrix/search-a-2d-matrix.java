

class Solution {

    public boolean searchMatrix(int[][] arr, int target) {

        int possibleRow = searchPossibleRow(arr, target);

        if (possibleRow != -1) {
            return rowBinarySearch(arr, target, possibleRow);
        }

        return false;
    }

    public int searchPossibleRow(int arr[][], int target){
        int start = 0;
        int end = arr.length-1;


        while (start <= end){
            int mid = start + (end - start) / 2;


            if (
                arr[mid][0]<=target && 
                arr[mid][arr[mid].length-1]>=target
            ) {
                return mid;
            }

            else{
                if (target <arr[mid][0]){
                    end = mid -1;
                }else if(target > arr[mid][ arr[mid].length-1 ]){
                    start =mid+1;
                }
            }
        }

        return -1;
    }

        public boolean rowBinarySearch (int arr[][], int target, int rowNumber){
                    int start = 0;
                    int end = arr[rowNumber].length - 1;
        while (start <= end){
            int mid = start + (end-start) /2;

            if (arr[rowNumber][mid]==target){
                return true;
            }else{
                if (arr[rowNumber][mid]>target){
                    end = mid - 1;

                }else{
                    start = mid + 1;

                }
            }
        }

           return false;
        }

    }