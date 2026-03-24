1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int left =0,len=0;
4        HashMap<Character,Integer> window = new HashMap<>();
5       for(int right=0;right<s.length();right++){
6        window.put(s.charAt(right),right);
7            char temp = s.charAt(right);
8            if(window.containsKey(temp)){
9                   left= Math.max(left,window.get(temp)+1);
10            }
11             
12        len = Math.max(len,right-left+1);
13       }
14       return len;
15    }
16}