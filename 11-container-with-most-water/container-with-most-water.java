class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int left=0;
        int right=height.length-1, currentHeight;

        while(left<right){
            currentHeight=Math.min(height[left], height[right]);
            int a=currentHeight * (right-left);
            if(a>area){
                area=a;
            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;
    }
}