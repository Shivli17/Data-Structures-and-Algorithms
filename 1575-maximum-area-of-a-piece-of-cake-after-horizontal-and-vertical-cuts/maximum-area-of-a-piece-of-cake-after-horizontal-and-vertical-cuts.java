class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

        int[] verticalCut=new int[verticalCuts.length+2];
        int[] horizontalCut=new int[horizontalCuts.length+2];
        newArr(horizontalCut, horizontalCuts);
        newArr(verticalCut, verticalCuts);

        verticalCut[verticalCut.length-1]=w;
        horizontalCut[horizontalCut.length-1]=h;

        Arrays.sort(verticalCut);
        Arrays.sort(horizontalCut);

        int maxH=MaxDiff(horizontalCut);
        int maxV=MaxDiff(verticalCut);
        return (int)((long)maxH * maxV % 1000000007);
    }

    public void newArr(int[] n, int[] o){
        for(int i=0; i<o.length; i++){
            n[i]=o[i];
        }
        n[n.length-2]=0;
    }
    public int MaxDiff(int[] arr){
        int max=0;
        for(int i=0; i<arr.length-1; i++){
            max=((arr[i+1]-arr[i])>max)?(arr[i+1]-arr[i]):max;
        }
        return max;
    }
}