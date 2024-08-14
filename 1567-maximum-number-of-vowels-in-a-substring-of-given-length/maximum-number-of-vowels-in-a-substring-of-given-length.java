class Solution {
    public int maxVowels(String s, int k) {
        int sum=0;
        for(int i=0; i<k; i++){
            if("aeiou".indexOf(s.charAt(i))!=-1){
                sum++;
            }
        }
        int max=sum;
        for(int i=k; i<s.length(); i++){
            if("aeiou".indexOf(s.charAt(i))!=-1){
                sum++;
            }
            if("aeiou".indexOf(s.charAt(i-k))!=-1){
                sum--;
            }
            max=max<sum?sum:max;
        }
        return max;
    }
}