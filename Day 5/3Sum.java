class Solution {
    List<List<Integer>> tripletList = new LinkedList<List<Integer>>();
    
    // Find all non-duplicate triplets that sums up to 0
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            int pairTarget = -nums[i];
            
            while (j < k) {
                // Case 1
                if (nums[j] + nums[k] == pairTarget) {
                    List<Integer> triplet = new LinkedList<Integer>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    tripletList.add(triplet);
          
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
                // Case 2
                if (nums[j] + nums[k] < pairTarget) {
                    j++;
                }
                // Case 3
                if (nums[j] + nums[k] > pairTarget) {
                    k--;
                }
            }
        }
        
        return tripletList;
    }
}
