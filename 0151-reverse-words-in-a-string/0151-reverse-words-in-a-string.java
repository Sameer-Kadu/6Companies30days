class Solution {
    public String reverseWords(String s) {
         StringBuilder a = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int l = s.length() - 1;
        
        for (int i = l; i >= 0; i--) {
            if (s.charAt(i) != ' ') { 
                stack.push(s.charAt(i));  // Push characters to stack
                if (i == 0) {  // Edge case: first word (at start of string)
                    while (!stack.isEmpty()) {
                        a.append(stack.pop());
                    }
                }
            } else {
                if (!stack.isEmpty()) {  // If stack contains a word, append it
                    while (!stack.isEmpty()) {
                        a.append(stack.pop());
                    }
                    a.append(" ");  // Add space after a word
                }
            }
        }

        return a.toString().trim(); 
    }
}