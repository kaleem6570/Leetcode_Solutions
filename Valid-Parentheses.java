1class Solution {
2    public boolean isValid(String p) {
3        ArrayDeque<Character> s = new ArrayDeque();
4        for (char c : p.toCharArray()) {
5            if (c=='{')
6                s.push('}');
7           else if (c=='(')
8                s.push(')');
9           else if (c=='[')
10                s.push(']');
11           else
12              {
13                if(s.isEmpty()||s.pop()!=c)
14                   return false;
15              }
16        }
17        return s.isEmpty();
18    }
19}