class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1;){
            if(nums[i]==nums[i+1]){
                i=i+2;
            }
            else {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}