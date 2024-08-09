class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1=0, w2=0;
        String out="";
        while(word1.length()>w1 && word2.length()>w2){
            out=out+word1.charAt(w1) + word2.charAt(w2);
            w1++;
            w2++;
        }
        if(w1<word1.length()){
            for(int i=w1; i<word1.length(); i++){
                out=out+word1.charAt(i);
            }
        }
        if(w2<word2.length()){
            for(int i=w2; i<word2.length(); i++){
                out=out+word2.charAt(i);
            }
        }
        return out;
    }
}