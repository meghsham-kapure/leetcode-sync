class Solution {

    public int[] searchRange(int[] nums, int target) { 

        int start = search(nums, target, true);  
        int end = search(nums, target, false);

        return new int [] { start, end }; 

    }
    
    public int search(int nums[], int target, boolean isFindingStart) { 

        if (nums.length == 0) return -1;

        int lastFoundAt = -1;

        int start = 0 ; 
        int end  = nums.length-1 ; 

        while ( start <= end ) {

            int mid = start + ( end - start ) / 2 ;

            if ( nums [mid] < target ) {
                start = mid + 1 ;
            }

             else if ( nums [mid] > target ) {
                end = mid -1 ;
            }

            else {

                lastFoundAt = mid;

                if ( isFindingStart ) {
                    end = mid - 1 ;
                }
                
                else{
                    start = mid + 1 ; 
                }
            }
        }

        return lastFoundAt;
    }
}