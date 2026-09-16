class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> list;
        backtrack(nums,0,list);
        return list;
    }
    void backtrack(vector<int>& nums,int index,vector<vector<int>>& result){
        if(index==nums.size()){
            vector<int> temp;
            for(int i=0;i<nums.size();i++){
                temp.push_back(nums[i]);
            }
            result.push_back(temp);
            return;
        }
        for(int i=index;i<nums.size();i++){
            swap(nums,i,index);
            backtrack(nums,index+1,result);
            swap(nums,i,index);
        }
    }
    void swap(vector<int>& nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
};