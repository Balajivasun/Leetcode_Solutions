class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> vect;
        unordered_map<string,vector<int>> map;
        for(int i=0;i<strs.size();i++){
            string s=strs[i];
            sort(s.begin(),s.end());
            map[s].push_back(i);
        }
        for(auto &entry : map) {
            vector<string> curr;
            for(int index : entry.second) {
                curr.push_back(strs[index]);
            }
            vect.push_back(curr);
        }

        return vect;
    }
};