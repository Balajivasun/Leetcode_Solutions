class Solution {
public:
    bool isPalindrome(int x) {
        int og=x;
        long rev=0;
        while(x>0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(og==rev){
            return true;
        }
        return  false;
    }
};