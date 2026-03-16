1class Solution {
2    public boolean isValid(String p) {
3        char a[] = p.toCharArray();
4        Stack<Character> s = new Stack();
5        for (int i = 0; i < a.length; i++) {
6            if (a[i] == '(' || a[i] == '{' || a[i] == '[')
7                s.push(a[i]);// soting { ,[ , (
8            else if (s.isEmpty())// if stack is empty 
9                return false;
10            else {
11                char s1 = s.peek();// pop the matched element
12                if ((a[i] == ')' && s1 == '(') || (a[i] == '}' && s1 == '{') || (a[i] == ']' && s1 == '['))
13                    s.pop();
14                else 
15                 return false;
16            }
17        }
18        return s.isEmpty();
19    }
20}