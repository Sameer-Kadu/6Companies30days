class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
        int higest = 0;
        if(nums.length == 1)
        {
            if(nums[0] == 1)
            {
                return 1;
            }
            else{
                return 0;
            }
        }
    
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] == 1 || nums[i + 1] == 1) {
                    temp++;
                     if (higest < temp) {
                        higest = temp;
                    }
                } else {
                   temp = 0;
                }
            } else {
                if (i < nums.length - 1) {
                    if (nums[i] == 1 && nums[i - 1] == 1 || nums[i] == 1 && nums[i + 1] == 1) {
                        temp++;
                         if (higest < temp) {
                            higest = temp;
                        }
                    } else {
                       temp = 0;
                    }
                } else {
                    if (nums[i] == 1 && nums[i - 1] == 1) {
                        temp++;
                        if (higest < temp) {
                            higest = temp;
                        }
                    } else {
                        temp = 0;
                    }
                }
            }
        }
        return higest;
    }
}