public class Solution {
    public int search(int[] A, int target) {
        int lo = 0;
        int hi = A.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (A[mid] == target) {
               return mid;
            }
            if (A[lo] < A[mid]) { // in this case, left side CANNOT have inflection point, and is increasing.
                if (A[lo] <= target && target < A[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else if (A[lo] > A[mid]) {
                if (A[mid] < target && target <= A[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            } else { // since no duplicates in input. Only happens when array is size <=2, so (lo == mid).
                lo = mid + 1; // search right, since A[lo] was already compared to 'target'.
            }
        }
        return -1;
    }
}
