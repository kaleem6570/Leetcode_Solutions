class Solution {
    public long minimumSteps(String s) {
        int blackBallCount=0;
        long totalSwaps=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                totalSwaps+=(long)blackBallCount;
            }
            else{
                blackBallCount++;
            }
        }
        return totalSwaps;
    }
}