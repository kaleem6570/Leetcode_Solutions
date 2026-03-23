1class Solution {
2    public boolean isPalindrome(String s) {
3        String s1=removeGap(s.toLowerCase());
4      int i= 0,j=s1.length()-1;
5     
6      while(i<j){
7        if(s1.charAt(i)==s1.charAt(j))
8        {
9            i++;
10            j--;
11        }
12        else
13        return false;
14      }
15      return true;
16    }
17    public  String removeGap(String s){
18
19        String s2="";
20        for(int i=0;i<s.length();i++){
21            char temp =s.charAt(i);
22            if(temp>='a'&&temp<='z'||temp>='0'&& temp<='9')
23            s2+= temp;
24        }
25        return s2;
26    }
27
28}