class Solution {
   public int subarraySum(int[] arr, int s) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        // Initialize to handle cases where sum itself equals `s`
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Update prefix sum

            // Check if `sum - s` exists in the map
            count += map.getOrDefault(sum - s, 0);

            // Update the frequency of `sum`
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}