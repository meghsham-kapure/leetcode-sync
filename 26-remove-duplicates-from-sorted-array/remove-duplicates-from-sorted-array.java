class Solution {
 public int removeDuplicates(int[] arr) {
        int uniquePointer = 0;

        for (int i=1; i<arr.length; i++){

            if (arr[uniquePointer]!=arr[i]){
                arr[++uniquePointer]=arr[i];
            }
        }
        return  uniquePointer+1;

    }
}