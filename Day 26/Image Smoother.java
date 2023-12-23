class Solution {
    public int[][] imageSmoother(int[][] M) {
        if (M == null || M.length == 0 || M[0].length == 0) {
            return M;
        }
        int m = M.length;
        int n = M[0].length;
        int[][] N = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int res = count(M, i, j);
                N[i][j] = res;
            }
        }
        return N;
    }
    private int count(int[][] M, int i0 , int j0) {
        int cells = 0;
        int sum = 0;
        for (int i = Math.max(0, i0 - 1); i <= Math.min(i0 + 1, M.length - 1); i++) {
            for (int j = Math.max(0, j0 - 1); j <= Math.min(j0 + 1, M[0].length - 1); j++) {
                cells++;
                sum += M[i][j];
            }
        }
        return sum / cells;
    }
}
