class Solution {
    public String reverseWords(String s) {
        String word="", res="";
        s=s+" ";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                word=word+s.charAt(i);
            }
            else if (!word.isEmpty()) {
                res = word + (res.isEmpty() ? "" : " " + res);
                word = "";
            }
        }
        return res.trim();
    }
}