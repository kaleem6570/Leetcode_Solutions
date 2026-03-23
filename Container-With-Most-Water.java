1class Solution {
2    public int maxArea(int[] a) {
3        int i=0,j=a.length-1,max=0;
4        while(i<j){
5           if(a[i]<=a[j])
6           {
7             int width =j -i;
8             int total = width * Math.min(a[i],a[j]);
9             if(total>max) max = total;
10           i++;
11           }
12           else{
13            int width = j - i;
14            int total = width * Math.min(a[i],a[j]);
15            if(total>max) max = total;
16            j--;
17           }
18            }
19            return max;
20        }
21    }
22