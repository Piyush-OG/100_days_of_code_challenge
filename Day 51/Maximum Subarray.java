class Solution {
    public int maxSubArray(int[] A) {
        if (A == null || A.length == 0) {
            throw new IllegalArgumentException();
        }
        int[] dp = new int[A.length];
        dp[0] = A[0];
        int maxSum = A[0];
        for (int i = 1; i < A.length; i++) {
            dp[i] = Math.max(dp[i - 1] + A[i], A[i]);
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }
}
