class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0,t=0,tw=0;
        for(int i:bills){
            if(i==5){
                f++;
            }
            else if(i==10){
                if(f<1){
                    return false;
                }
                else{
                    f--;
                    t++;
                }
            }else{
                tw++;
                if(t>=1 && f>=1){
                    t--;
                    f--;
                }else if(f>=3){
                    f=f-3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}