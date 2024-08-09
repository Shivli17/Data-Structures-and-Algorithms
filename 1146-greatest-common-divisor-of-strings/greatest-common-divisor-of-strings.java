class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenating str1+str2 is equal to str2+str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // Calculate the GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());
        
        // The GCD string would be the prefix of length gcdLength in either str1 or str2
        return str1.substring(0, gcdLength);
    }
    
    // Helper method to calculate the GCD of two numbers
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
