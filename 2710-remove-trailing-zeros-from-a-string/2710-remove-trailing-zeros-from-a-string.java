class Solution {
    public String removeTrailingZeros(String num) {
        int j=-1;
        boolean found=false;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)!='0'){
                j=i;
                break;
            }
            else{
                continue;
            }
    
        }
        return num.substring(0,j+1);
    }
}