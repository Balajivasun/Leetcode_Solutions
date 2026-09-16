class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(nums,0,list);
        return list;
    }
    public static void backtrack(int nums[],int index,List<List<Integer>> result){
        if(index==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            result.add(temp);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            backtrack(nums,index+1,result);
            swap(nums,i,index);
        }

    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}