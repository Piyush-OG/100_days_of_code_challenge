class Solution {
    private int[] findDeltas(int[] array) {
        int[] deltas = new int[array.length];
        int delta = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                delta++;
            } else if (array[i] == 0) {
                delta--;
            }
            deltas[i] = delta;
        }
        return deltas;
    }

    public int findMaxLength(int[] array) {
        if (array == null) {
            return 0;
        }
        int[] deltas = findDeltas(array);
        Map<Integer, Integer> map = new HashMap();
        map.put(0, -1); // for testcases such as [1, 0], [1, 0, 0]
        int maxLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(deltas[i])) {
                map.put(deltas[i], i);
            } else {
                maxLength = Math.max(maxLength, i - map.get(deltas[i]));
            }
        }
        return maxLength;
    }
}
