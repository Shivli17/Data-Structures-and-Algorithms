class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[]=new int[nums1.length+nums2.length];
        for(int i=0; i<nums1.length; i++){
            merged[i]=nums1[i];
        }
        for(int i=0; i<nums2.length; i++){
            merged[i+nums1.length]=nums2[i];
        }
        Arrays.sort(merged);
        double median;
        if(merged.length%2==0){
            median= ((double)merged[merged.length/2]+merged[(merged.length/2)-1])/2;
        }
        else{
            median= merged[(merged.length/2)];
        }

        return median;
    }
}