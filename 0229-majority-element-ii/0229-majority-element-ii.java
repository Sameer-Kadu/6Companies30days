class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // List<Integer> list = new ArrayList<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(map.containsKey(nums[i]))
        //     {
        //         map.put(nums[i], map.get(nums[i])+1);
        //     }
        //     else{
        //         map.put(nums[i], 1);
        //     }
        //     if(map.get(nums[i]) > nums.length/3 && !list.contains(nums[i]))
        //     {
        //         list.add(nums[i]);
        //     }
        // }
        List<Integer> list = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int num1= Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(count1 == 0 && nums[i] != num2)
            {
                count1 = 1;
                num1 = nums[i];
            }
            else if(count2 == 0 && nums[i] != num1)
            {
                count2 = 1;
                num2 = nums[i];
            }
            else if(num1 == nums[i])
            {
                count1++;
            }
            else if(num2 == nums[i])
            {
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == num1) count1++;
            if(nums[i] == num2) count2++;
        }
        if(count1 > nums.length/3)
        {
            list.add(num1);
        }
        if(count2 > nums.length/3)
        {
            list.add(num2);
        }
        
        return list;
    }
}