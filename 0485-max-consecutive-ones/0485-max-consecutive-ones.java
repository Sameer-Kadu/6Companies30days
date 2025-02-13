class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
        int higest = 0;
       
    
        for (int i = 0; i < nums.length; i++) {
           
            if(nums[i] == 1)
            {
                temp++;
                if(higest < temp)
                {
                    higest = temp;
                }
            }
            else{
                temp = 0;
            }
        }
        return higest;
    }
}