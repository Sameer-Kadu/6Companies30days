class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        Stack<Character> stack = new Stack<>();

        for(int  i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!map.containsKey(c))
            {
                stack.push(c);
            }
            else {
                if(stack.isEmpty())
                {
                    return false;
                }
                else{
                    char top = stack.pop();
                    if(top != map.get(c))
                    {
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        
        }
        else{
            return false;
        }
    }
}