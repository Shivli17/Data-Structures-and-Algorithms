class Solution {
    public String reverseVowels(String s) {
        String Vowels="", res="";
        for(int i=0; i<s.length(); i++){
            if(("aeiouAEIOU".indexOf(s.charAt(i)))!=-1){
                Vowels=""+s.charAt(i)+Vowels;
            }
        }
        int a=0;
        for(int i=0; i<s.length(); i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                res=res+Vowels.charAt(a);
                a++;
            }
            else{
                res=res+s.charAt(i);
            }
        }
        return res;
    }
}