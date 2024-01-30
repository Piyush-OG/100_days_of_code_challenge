class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] seen = new boolean[nums.length+1];
        for(int i : nums)
        {
            seen[i] = true; //mark the num as seen
        }
        
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i < seen.length; i++)
        {
            if(!seen[i])
            {
                res.add(i);
            }
        }
        return res;
        
    }
}
