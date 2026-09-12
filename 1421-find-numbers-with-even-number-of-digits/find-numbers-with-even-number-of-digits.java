class Solution {
    public int findNumbers(int[] nums) {
        

        int evenDigitNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = getCountDigits(nums[i]);

            if (digits % 2 == 0) {
                evenDigitNumbers++;
            }
        }

        return evenDigitNumbers;
    }

     public static int countDigits(int number) {
        int digits = 0;

        while (number > 0) {

            digits++;
            number = number / 10;
        }

        return digits;
    }

    public static int getCountDigits(int number) {
        return (int) (Math.log10(number) + 1);
    }
}