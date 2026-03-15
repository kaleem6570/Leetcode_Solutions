1class Solution {
2    public int romanToInt(String s) {
3        int count = 0;
4          int I=1,V=5,X=10,L=50,C= 100,D=500,M= 1000;
5          char[] a = s.toCharArray();
6          for(int i=0;i<s.length();i++){
7            if(a[i]=='I'||a[i]=='V'||a[i]=='X'||a[i]=='L'||a[i]=='C'||a[i]=='D'||a[i]=='M')
8            {
9                int index = 0;
10                 int after = 0;
11                if((a[i]=='I'||a[i]=='X'||a[i]=='C')&&i+1<=s.length()-1){
12           
13              switch(a[i]){
14                 case 'I' : 
15                   index+=1;
16                   break;
17                     case 'X' : 
18                   index+=10;
19                   break;
20                     case 'C' : 
21                   index+=100;
22                   break;
23              }
24            
25               switch(a[i+1]){
26                case 'I' : 
27                   after+=1;
28                   break;
29                    case 'V' : 
30                   after+=5;
31                   break;
32                    case 'X' : 
33                   after+=10;
34                   break;
35                    case 'L' : 
36                   after+=50;
37                   break;
38                    case 'C' : 
39                   after+=100;
40                   break;
41                    case 'D' : 
42                   after+=500;
43                   break;
44                    case 'M' : 
45                   after+=1000;
46                   break;
47                }
48           
49             
50              
51                }
52              if(index<after){
53                count-=index;
54            }
55           else
56            {
57               switch(a[i]){
58                case 'I' : 
59                   count+=1;
60                   break;
61                    case 'V' : 
62                   count+=5;
63                   break;
64                    case 'X' : 
65                   count+=10;
66                   break;
67                    case 'L' : 
68                   count+=50;
69                   break;
70                    case 'C' : 
71                   count+=100;
72                   break;
73                    case 'D' : 
74                   count+=500;
75                   break;
76                    case 'M' : 
77                   count+=1000;
78                   break;
79            }
80           }
81            }
82          }
83          return count;
84    }
85}