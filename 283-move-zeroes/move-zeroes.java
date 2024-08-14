class Solution {
    public void moveZeroes(int[] nums) {
        int[] newNum=new int[nums.length];
        int a=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                newNum[a]=nums[i];
                a++;
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=newNum[i];
        }
    }
}