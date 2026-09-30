class Solution {
    public int reverse(int num) {

        int reverseNum = 0;
        boolean isNegetive = false;

        if (num<0){
          isNegetive = true;
          num = 0 - num;
        }

        while (num>0){
          int digit = num % 10;
          num/=10;

          // Check overflow before multiplying by 10
        if (reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE / 10 && digit > 7)) {
            return 0; // overflow
        }
        if (reverseNum < Integer.MIN_VALUE / 10 || (reverseNum == Integer.MIN_VALUE / 10 && digit < -8)) {
            return 0; // underflow
        }

          reverseNum*=10;
          reverseNum+=digit;
        }

        if (isNegetive)
          return -reverseNum;
        else 
          return reverseNum;
    }
}