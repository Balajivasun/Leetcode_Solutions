class Solution {
public:
    int myAtoi(string s) {
        int i = 0;
        int result = 0;
        int sign=1;
        while (i < s.length() && s[i]==' ') {
            i++;
        }
        if(i<s.length() && (s[i]=='-' || s[i]=='+')){
            if(s[i]=='-'){
                sign=-1;
            }
            i++;
        }
        while (i < s.length() && isdigit(s[i])) {
            int digit = s[i] - '0';
            if (result > (INT_MAX - digit) / 10) {
                if (sign == 1) {
                    return INT_MAX;
                }
                return INT_MIN;
            }
            result = result * 10 + digit;
            i++;
        }
        return result*sign;
    }
};