1class Solution {
2    public int maxArea(int[] a) {
3        int i=0,j=a.length-1,max=0;
4        while(i<j){
5             int total = (j-i) * Math.min(a[i],a[j]);
6             if(total>max) max = total;
7           if(a[i]<a[j])
8           {
9           i++;
10           }
11           else{
12            j--;
13           }
14            }
15            return max;
16        }
17    }
18