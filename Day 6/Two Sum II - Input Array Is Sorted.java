class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if(nums == null || nums.length == 0) {
            return new int[]{};
        }
        
        int low = 0;
        int high = nums.length - 1;
        
        while(low < high) {
            int sum = nums[low] + nums[high] ;
            if(sum == target) {
                return new int[]{low + 1, high + 1};
            }
            else if(sum > target) {
                --high;
            }
            else {
                ++low;
            }
        }
        
        return new int[]{};
    }
}
