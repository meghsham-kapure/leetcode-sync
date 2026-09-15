class Solution {
 public  char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end  = arr.length-1;

        if(target>=arr[arr.length-1]) return arr[0];

        while(start<=end){
            int mid = start + ( end - start ) / 2;
            
            if (arr[mid] <= target) start = mid +1;
            else end = mid - 1;

          
        }

        return arr[start];
    }
}
