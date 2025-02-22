class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> listMain = new ArrayList<>();
        Arrays.sort(nums);
        int start = 0;
        int end = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i] == nums[i-1])
            {
                continue;
            }
            for(int j = i+1;j<nums.length-1;)
            {
                
                 start = j+1;
                end = nums.length -1;
                while(start < end)
                {
               
            long sum =(long) nums[i] + nums[j] + nums[start] + nums[end];
            
                if(sum < target)
                {
                    start++;
                }
                else if(sum > target)
                {
                    end--;
                }
                else if(sum == target){
                    System.out.println(sum);
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    listMain.add(list);
                    end--;
                    start++;
                    while(start < end && nums[start] == nums[start-1])
                    {
                        start++;
                    }
                }
                }
                j++;
                while(j<nums.length && nums[j] == nums[j-1])
                {
                    j++;
                }
            }
        }
        return listMain;
    }
}