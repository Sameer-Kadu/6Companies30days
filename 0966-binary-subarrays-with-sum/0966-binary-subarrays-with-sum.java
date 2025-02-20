class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        return small(nums, goal) - small(nums, goal-1);
        // for(int i=0;i<nums.length;i++)
        // {
        //     int sum = 0;
        //     List
        //     for(int j=i; j<nums.length;j++)
        //     {
        //         sum = sum + nums[j];
        //         if(sum == goal)
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }

    public int small(int []a, int goal)
    {
        if(goal < 0)
        {
            return 0;
        }
        int count = 0;
        int sum = 0;
        int l = 0;
        int r = 0;
        
        while(r< a.length)
        {
            sum = sum + a[r];
            while(sum > goal)
            {
                sum = sum - a[l];
                l++;
            }
            count = count + (r-l+1);
            r = r+1;
        }
        return count;
    }

}