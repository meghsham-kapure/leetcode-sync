import java.util.*;
class Solution {
    public int maxFreqSum(String s) {
        int maxVowel = 0;
        int maxConsonant = 0;

        int[] letter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letter[(s.charAt(i) - 'a')]++;

            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    if (letter[(s.charAt(i) - 'a')] > maxVowel) {
                        maxVowel = letter[(s.charAt(i) - 'a')];
                    }
                    break;
                default:
                    if (letter[(s.charAt(i) - 'a')] > maxConsonant) {
                        maxConsonant = letter[(s.charAt(i) - 'a')];
                    }
            }
        }
        return maxConsonant + maxVowel;
    }
}