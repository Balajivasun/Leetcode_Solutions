class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int i=0;
        int sign=1;
        if( i<s.length() && s.charAt(i)=='-' ){
            sign=-1;
            i++;
        }
        else if(i<s.length() && s.charAt(i)=='+'){
            i++;
        }
        int result=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))  ){
            int digit=s.charAt(i)-'0';
            if(result>(Integer.MAX_VALUE-digit)/10){
                if(sign==1){
                    return Integer.MAX_VALUE;
                }
                return Integer.MIN_VALUE;
            }
            result=result*10+digit;
            i++;
        }
        return result*sign;

    }
}