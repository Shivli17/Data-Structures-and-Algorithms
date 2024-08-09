class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int count = 0;
        
        // Iterate over each possible 3x3 subgrid
        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    // Helper method to check if the subgrid is a magic square
    private boolean isMagicSquare(int[][] grid, int r, int c) {
        // Check if all values are distinct and in the range [1, 9]
        boolean[] seen = new boolean[10]; // To track numbers 1-9
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int val = grid[r + i][c + j];
                if (val < 1 || val > 9 || seen[val]) {
                    return false;
                }
                seen[val] = true;
            }
        }
        
        // Sum of the first row (This will be the reference sum)
        int sum = grid[r][c] + grid[r][c + 1] + grid[r][c + 2];
        
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (grid[r + i][c] + grid[r + i][c + 1] + grid[r + i][c + 2] != sum) {
                return false;
            }
        }
        
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (grid[r][c + j] + grid[r + 1][c + j] + grid[r + 2][c + j] != sum) {
                return false;
            }
        }
        
        // Check diagonals
        if (grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2] != sum ||
            grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c] != sum) {
            return false;
        }
        
        return true;
    }
}
