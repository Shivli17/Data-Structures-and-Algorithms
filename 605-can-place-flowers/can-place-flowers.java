class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            // Check if the current plot is empty and can plant a flower
            if (flowerbed[i] == 0) {
                // Check the previous and next plots
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == length - 1) || (flowerbed[i + 1] == 0);
                
                if (leftEmpty && rightEmpty) {
                    // Plant a flower here
                    flowerbed[i] = 1;
                    n--; // Decrease the number of flowers to plant
                    if (n == 0) return true; // Early exit if all flowers are planted
                }
            }
        }
        
        return n <= 0; // Return true if all flowers have been planted, otherwise false
    }
}
