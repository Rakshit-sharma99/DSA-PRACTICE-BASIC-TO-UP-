package NUMBERS;

public class palindrome {
    class Solution {
    public boolean isPalindrome(int x) {
        int j = x;

        int rev = 0;

        while (x > 0) {
            int l = x % 10;

            rev = rev * 10 + l;
            x = x / 10;

        }

        if (rev ==j) {
            return true;
        }
        else return false;
    }
}
}
