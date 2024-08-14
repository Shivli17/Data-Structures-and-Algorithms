class Solution {
    public int maxOperations(int[] nums, int k) {
        int left=0, right=nums.length-1, total=0;
        Arrays.sort(nums);
        while(right>left){
            if(nums[left]+nums[right]==k){
                total++;
                right--;
                left++;
            }
            else if(nums[left]+nums[right]>k){
                right--;
            }
            else{
                left++;
            }
        }
        return total;
    }
}