class Solution {
    public String longestPalindrome(String s) {
        
        String outStr="";
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String str = s.substring(i, j + 1);
                if(isPal(str) && str.length() > outStr.length()){
                    outStr=str;
                }
            }
            
        }
        return outStr;
    }

    public boolean isPal(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}