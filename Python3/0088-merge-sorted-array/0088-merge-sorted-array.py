class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i=0
        for x in range(m,len(nums1)):
            nums1[x]=nums2[i]
            i=i+1
        nums1.sort()
        
        