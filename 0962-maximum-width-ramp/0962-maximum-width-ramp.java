class Solution {
    public int maxWidthRamp(int[] nums) {
        int n =nums.length;
        Integer[] indices= new Integer[n];
        for(int i=0;i<n;i++){
            indices[i]=i;
        }
        Arrays.sort(indices,(i,j)->
            nums[i]!=nums[j]?nums[i]-nums[j] :i-j);
        int minIndex =n;
        int maxwidth =0;
        for(int i:indices){
            maxwidth =Math.max(maxwidth, i-minIndex);
            minIndex = Math.min(minIndex,i);
        }
        return maxwidth;
    }
}