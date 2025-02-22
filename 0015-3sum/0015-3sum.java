class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int start = 0;
        int end = 0;
        Arrays.sort(nums);
        List<List<Integer>> listMain = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            start = i+1;
            end = nums.length-1;
            if(i>0 && nums[i] == nums[i-1])
            {
                continue;
            }
            while(start < end)
            {
                int sum =  nums[i] + nums[start] + nums[end];
                if(sum == 0)
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    listMain.add(list);
                    start++;
                    end--;
                    while(start < end && nums[start] == nums[start-1])
                    {
                        start++;
                    }
                    
                }
                else if(sum < 0)
                {
                    start++;
                }
                else if(sum > 0)
                {
                    end--;
                }
            }
        }
        return listMain;  
    }
}