class Solution {
    public boolean isValid(String str) {
        if ((str.length() % 2) != 0) {
            return false; // odd length Strings are not balanced
        }

        Map<Character, Character> map = new HashMap();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Deque<Character> deque = new ArrayDeque(); // use deque as a stack
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }
}
