class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> carr = new ArrayList<>();
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (!carr.contains(currentChar)) {
                carr.add(currentChar);
            } else {
                maxLength = Math.max(maxLength, carr.size());

                // Remove characters from the beginning until the duplicate is removed
                while (carr.contains(currentChar)) {
                    carr.remove(0);
                }

                carr.add(currentChar);
            }
        }

        // Check the last substring length
        maxLength = Math.max(maxLength, carr.size());

        return maxLength;
    }
}