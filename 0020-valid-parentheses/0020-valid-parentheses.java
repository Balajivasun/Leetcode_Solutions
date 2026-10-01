class Solution {
    public boolean isValid(String s) {
        while (true) {
            String prev = s;
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            if (s.length() == prev.length()) {
                break;
            }
        }
        return s.isEmpty();
    }
}