class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if(s.length()<2){
            if(s.length()==0){
                return 0;
            }
            return 1;
        }
        int st=0;
        int end=0;
        set<char> ans;
        int maxi=0;
        while(end<s.length()){
            char ch=s[end];
            while(ans.count(ch)){
                ans.erase(s[st]);
                st++;
            }
            ans.insert(ch);
            int ws=end-st+1;
            maxi=max(ws,maxi);
            end++;
        }
        return maxi;
    }
};