class Solution {
    public void moveZeroes(int[] nums) {
        int L=0, R=0;
        for(R=0; R<nums.length; R++){
            if(nums[R]!=0){
                int temp=nums[R];
                nums[R]=nums[L];
                nums[L]=temp;
                L++;
            }
        }
    }
}