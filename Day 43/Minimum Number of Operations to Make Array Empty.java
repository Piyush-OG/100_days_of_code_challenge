class Solution {
    public int minOperations(int[] nums) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        int operations = 0;
        for (int num : nums)
        {
            int count = hm.getOrDefault(num, 0) + 1;
            hm.put(num, count);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            int t = entry.getValue();
            if (t == 1)
                return -1;
            operations += t/3;
            if (t % 3 != 0)  
            operations++;
        }
        return operations;
    }
}
