class Solution {
    public String reverseVowels(String s) {
        List<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isvow(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        char[] carr=s.toCharArray();
        for(int i=0;i<carr.length;i++){
            if(isvow(carr[i])){
                carr[i]=list.get(list.size()-1);
                list.remove(list.size()-1);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ck:carr){
            sb.append(ck);
        }
        return sb.toString();
    }
    public static boolean isvow(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
}