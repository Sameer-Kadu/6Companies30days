class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
         int count = 0;
         while(right < nums.length)
         {
            if(nums[right] == 0)
            {
                count++;
            }
            while(count > k)
            {
                if(nums[left] == 0)
                {
                    count--;
                    
                }
                left++;
            }
            if(count <= k)
            {
                maxLength = Math.max(maxLength, right - left +1);
            }
            right++;
         }
         return maxLength;
    }
}