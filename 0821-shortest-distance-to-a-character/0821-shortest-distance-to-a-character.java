class Solution {
    public int[] shortestToChar(String s, char c) {
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int mini=Integer.MAX_VALUE;
            if(s.charAt(i)==c){
                arr[i]=0;
                continue;
            }
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==c){
                    mini=Math.min(Math.abs(j-i),mini);
                }
            }
            arr[i]=mini;
        }
        return arr;
    }
}