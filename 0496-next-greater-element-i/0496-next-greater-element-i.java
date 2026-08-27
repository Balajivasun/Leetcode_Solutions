class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int curr=nums1[i];
            int next=-1;
            for(int j=0;j<nums2.length;j++){
                if(curr==nums2[j]){
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums2[k]>curr){
                            next=nums2[k];
                            break;
                        }
                    }
                    res[i]=next;
                    break;
                }
            }
        }
        return res;
    }
}