class Solution {
    public String reverseVowels(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if(isVow(s.charAt(i))){
                str+=s.charAt(i)+"";
            }
        }
        int last=str.length()-1;
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(isVow(s.charAt(i))){
                chars[i] = str.charAt(last);
                last--;
            }
        }
        return new String(chars);
    }
    public static boolean isVow(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
}