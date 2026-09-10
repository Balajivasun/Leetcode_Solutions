class Solution {
public:
    bool isVow(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
    string reverseVowels(string s) {
        string str = "";
        for (int i = 0; i < s.length(); i++) {
            if (isVow(s[i])) {
                str += s[i]; 
            }
        } 
        int last = str.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (isVow(s[i])) {
                s[i] = str[last];
                last--;
            }
        }      
        return s;
    }
};