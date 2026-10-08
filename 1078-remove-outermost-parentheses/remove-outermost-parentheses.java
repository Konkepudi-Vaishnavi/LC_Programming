class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                cnt++;
                if (cnt > 1) {
                    res.append(c);
                }
            } else {
                if (cnt > 1) {
                    res.append(c);
                }
                cnt--;
            }
        }
        return res.toString();
    }
}