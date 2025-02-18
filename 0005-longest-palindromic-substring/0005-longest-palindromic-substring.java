class Solution {
    public String longestPalindrome(String a) {
        if( a == null || a.length() == 0)
        {
            return "";
        }
        int start = 0;
        int end = 0;
        for(int i= 0;i<a.length();i++)
        {
            int length1 = checkPal(a,i,i);
            int length2 = checkPal(a,i,i+1);
            int max = Math.max(length1, length2);
            if(max > end-start)
            {
                start = i-(max-1)/2;
                end = i+max/2;
            }
        }
        return a.substring(start , end+1);
    }
    public int checkPal(String a, int l, int r)
    {
        while(l>=0 && r < a.length() && a.charAt(l) == a.charAt(r))
        {
            l--;
            r++;
        }
        return r - l- 1;
    }
}