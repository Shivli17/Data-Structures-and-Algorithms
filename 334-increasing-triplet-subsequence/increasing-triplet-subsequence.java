class Solution {
    public boolean increasingTriplet(int[] nums) {
        // Initialize two variables to the maximum possible value
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= first) {
                first = num;  // Update first if current num is smaller
            } else if (num <= second) {
                second = num;  // Update second if current num is smaller and greater than first
            } else {
                // If we find a number greater than both first and second, we have found our triplet
                return true;
            }
        }
        
        // If no such triplet found, return false
        return false;
    }
}
