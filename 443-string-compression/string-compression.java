class Solution {
    public int compress(char[] chars) {
        int index = 0; // Index to store the compressed characters
        int i = 0; // Index to traverse the array
        
        while (i < chars.length) {
            char c = chars[i];
            int length = 0;
            
            // Count the number of occurrences of the current character
            while (i < chars.length && chars[i] == c) {
                i++;
                length++;
            }
            
            // Store the character
            chars[index++] = c;
            
            // Store the length if greater than 1
            if (length > 1) {
                for (char digit : Integer.toString(length).toCharArray()) {
                    chars[index++] = digit;
                }
            }
        }
        
        // Return the new length of the array
        return index;
    }
}
