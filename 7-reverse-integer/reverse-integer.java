class Solution {
    public int reverse(int x) {
        int o = 0;
        boolean c = false;
        
        // Check if the number is negative
        if (x < 0) {
            c = true;
            x = x * -1;
        }
        
        // Reverse the digits
        while (x > 0) {
            int pop = x % 10;
            x = x / 10;
            
            // Check for overflow before updating the reversed number
            if (o > (Integer.MAX_VALUE - pop) / 10) {
                return 0;
            }
            o = o * 10 + pop;
        }
        
        // If the original number was negative, make the result negative
        if (c) {
            o = o * -1;
        }
        
        return o;
    }
}
