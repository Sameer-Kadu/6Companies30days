class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int l = 0;
        int length = 0;
        int a[] = new int[26];
        for(int r=0;r<s.length();r++)
        {
            a[s.charAt(r) - 'A']++;
            max = Math.max(max, a[s.charAt(r)-'A']);
            length = r-l+1;
            while(length - max > k)
            {
                a[s.charAt(l) - 'A']--;
                l++;
                length = r-l+1;
            }            
        }
        return length;
    }
}