1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        String prefix  = strs[0];
4        for(int i=1;i<strs.length;i++){
5            while(strs[i].indexOf(prefix)!=0){
6                prefix = prefix.substring(0,prefix.length()-1);
7                if(prefix.isEmpty())break;
8            }
9        }
10        return prefix;
11    }
12}