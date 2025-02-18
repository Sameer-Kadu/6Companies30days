class Solution {
    public String removeOuterParentheses(String s) {
         String result = "";
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) {
                    result += ch;
                }
                depth++;
            } else if (ch == ')') {
                depth--;
                if (depth > 0) {
                    result += ch;
                }
            }
        }

        return result;
    }
}