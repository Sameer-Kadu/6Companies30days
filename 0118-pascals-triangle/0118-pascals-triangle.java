class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            list.add(generateRow(i));
        }
        return list;
    }
    public List<Integer> generateRow(int numRows) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int ans = 1;
        for(int i = 1;i<numRows;i++)
        {
            ans = ans * (numRows - i);
            ans = ans / i;
            list.add(ans);
        }
        return list;
    }
}