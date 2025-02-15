class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivote = -1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i] < nums[i+1])
            {
                pivote = i;
                break;
            }
        }

        if(pivote == -1)
        {
            reverse(0, n-1, nums);
            return;
        }

        for(int i=n-1;i>pivote;i--)
        {
            if(nums[i] > nums[pivote])
            {
                swap(pivote, i, nums);
                break;
            }
        }

        reverse(pivote+1, n-1, nums);
    }
    public void reverse(int i , int j , int []a)
    {
        int temp = 0;
        while (i < j)
        {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    public void swap(int i, int j, int []a)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp; 
    }
}