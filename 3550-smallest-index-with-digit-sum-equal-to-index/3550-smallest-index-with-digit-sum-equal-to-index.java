class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int rev=0;
            while(nums[i]>0){
                rev+=nums[i]%10;
                nums[i]/=10;
            }
            if(rev==i){
                return i;
            }
        }
        return -1;
    }
}