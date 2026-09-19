class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            if (s.length() == 0) {
                return 0;
            }
            return 1;
        }
        int st = 0;
        int end = 0;
        HashSet<Character> map = new HashSet<>();
        int maxi = 1;
        while (end < s.length()) {
            char ch = s.charAt(end);
            while (map.contains(ch)) {
                map.remove(s.charAt(st));
                st++;
            }
            map.add(ch);
            int ws = end - st + 1;
            end++;
            maxi = Math.max(ws, maxi);
        }
        return maxi;
    }
}