class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!ss.isEmpty()){
                    ss.pop();
                }
            }
            else{
                ss.push(s.charAt(i));
            }
        }
        Stack<Character> ts=new Stack<>();
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!ts.isEmpty()){
                    ts.pop();
                }
            }
            else{
                ts.push(t.charAt(i));
            }
        }
        if(ts.size()!=ss.size()){
            return false;
        }
        int size=ss.size();
        for(int i=0;i<size;i++){
            if(ss.peek()!=ts.peek()){
                return false;
            }
            ss.pop();
            ts.pop();
        }
        return true;
    }
}