class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        for(int j=0;j<nums1.length;j++)
        {
            if(nums1[j] == 0)
            {
                if(i<nums2.length)
                {
                     nums1[j] = nums2[i];
                i++;
                }
                
            }
        }
        Arrays.sort(nums1);
    }
}