class Solution {
    public int countTestedDevices(int[] bt) {
        int td=0;
        for(int i=0;i<bt.length;i++){
            if(bt[i]>0){
                td++; 
                for(int j=i+1;j<bt.length;j++){
                    bt[j]=Math.max(0,bt[j]-1);
                }   
            }
        }
        return td;
    }
}