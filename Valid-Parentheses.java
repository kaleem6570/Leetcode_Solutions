1class Solution {
2    public boolean isValid(String p) {
3       // char a[] = p.toCharArray();
4        ArrayDeque<Character> s = new ArrayDeque();
5        for (char c : p.toCharArray()) {
6            if (c=='{')
7                s.push('}');
8           else if (c=='(')
9                s.push(')');
10           else if (c=='[')
11                s.push(']');
12           else
13              {
14                if(s.isEmpty()||s.pop()!=c)
15                   return false;
16              }
17
18
19            // else if (s.isEmpty())// if stack is empty 
20            //     return false;
21            // else {
22            //     char s1 = s.peek();// pop the matched element
23            //     if ((a[i] == ')' && s1 == '(') || (a[i] == '}' && s1 == '{') || (a[i] == ']' && s1 == '['))
24            //         s.pop();
25            //     else
26            //         return false;
27            // }
28        }
29        return s.isEmpty();
30    }
31}