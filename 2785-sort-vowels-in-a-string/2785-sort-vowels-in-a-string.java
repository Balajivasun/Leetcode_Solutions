class Solution {
    public String sortVowels(String s) {
        List<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isvow(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        char[] carr=s.toCharArray();
        for(int i=0;i<carr.length;i++){
            if(isvow(s.charAt(i))){
                carr[i]=list.get(0);
                list.remove(0);
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