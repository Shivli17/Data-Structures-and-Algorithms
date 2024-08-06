class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int sum = 0, a = 0;
        boolean sign = true, start = false;

        // Ignore leading whitespaces
        while (a < s.length() && s.charAt(a) == ' ') {
            a++;
        }

        // Handle optional '+' or '-' sign
        if (a < s.length() && (s.charAt(a) == '+' || s.charAt(a) == '-')) {
            sign = (s.charAt(a) == '-') ? false : true;
            a++;
        }

        // Convert digits to an integer
        while (a < s.length() && s.charAt(a) >= '0' && s.charAt(a) <= '9') {
            int digit = s.charAt(a) - '0';

            // Check for overflow/underflow before multiplying
            if (sum > (Integer.MAX_VALUE - digit) / 10) {
                return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            sum = sum * 10 + digit;
            start = true;
            a++;
        }

        if (!sign) {
            sum = sum * -1;
        }

        return sum;
    }
}