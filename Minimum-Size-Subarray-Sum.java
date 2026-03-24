1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left=0, sum=0;
4        int minlen =Integer.MAX_VALUE;
5        for(int right=0;right<nums.length;right++){
6        sum+= nums[right];
7       while (sum>=target){
8         minlen = Math.min(minlen,right-left+1);
9            sum-=nums[left];
10             left++;
11           
12           
13        }
14
15        }
16        return minlen==Integer.MAX_VALUE?0:minlen;
17    }
18}