class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length , n=nums2.length;
        int[] merged = new int[m+n];
        for(int i=0;i<m;i++){
            merged[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            merged[m+i]=nums2[i];
        }
        Arrays.sort(merged);
        int merlen=merged.length;
        double median;
        if(merlen%2==1){
            median=merged[merlen/2];
        }
        else{
            median=(merged[merlen/2]+merged[merlen/2-1])/2.0;
        } 
        return median;       
    }
}