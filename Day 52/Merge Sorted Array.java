class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int lastA = m - 1;
        int lastB = n - 1;
        int curr = lastA + lastB + 1;
        while (lastA >= 0 && lastB >= 0) {
            if (A[lastA] > B[lastB]) {
                A[curr--] = A[lastA--];
            } else {
                A[curr--] = B[lastB--];
            }
        }

        while (lastB >= 0) {
            A[curr--] = B[lastB--];
        }
    }
}
