class Solution {
    public int hammingDistance(int x, int y) {
        int res=x^y;
        String a=Integer.toBinaryString(res);
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='1'){
                count=count+1;
            }
        }
        return count;
    }
}