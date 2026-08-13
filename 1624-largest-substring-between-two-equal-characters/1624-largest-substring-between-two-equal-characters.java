class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxi=-1;
        for(int i=0;i<s.length();i++){
            for(int j=1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    maxi=Math.max(maxi,j-i-1);
                }
            }
        }
        return maxi;
    }
}