class Solution {
    public String sortVowels(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if(isvow(s.charAt(i))){
                str+=s.charAt(i)+"";
            }
        }
        char[]vow=str.toCharArray();
        Arrays.sort(vow);
        int index=0;
        char[] carr=s.toCharArray();
        for(int i=0;i<carr.length;i++){
            if(isvow(s.charAt(i))){
                carr[i]=vow[index++];
            }
        }
        return  new String(carr);
    } 
    public static boolean isvow(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
}