class Solution {
    public int findFinalValue(int[] nums, int og) {
        Arrays.sort(nums);
        boolean found=true;
        while(found){
            found=false;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==og){
                    og=og*2;
                    found=true;
                    break;
                }
            }
        }
        return og;

    }
}