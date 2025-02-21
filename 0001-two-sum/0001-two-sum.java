class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<> ();
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = target - nums[i];
            if(map.containsKey(sum))
            {
                int a[] = {i,map.get(sum)};
                return a;
            }
            else{
                map.put(nums[i], i);
            }

        }
         return nums;
    }
}