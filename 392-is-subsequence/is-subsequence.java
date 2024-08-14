class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")){
            return true;
        }
        if(s.length()>t.length()){
            return false;
        }
        int a=0,i=0;
        boolean x=false;
        for(i=0; i<t.length(); i++){
            if(t.charAt(i)==s.charAt(a)){
                x=true;
                a++;
                if(a==s.length()){
                    return true;
                }
            }
        }
        if(i==t.length() && a<s.length()){
            return false;
        }
        return true;
    }
}