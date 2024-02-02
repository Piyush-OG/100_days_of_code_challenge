public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null ) throw new NullPointerException();
        int iLast = s.length() - 1;
        while (iLast >= 0 && s.charAt(iLast) == ' ') --iLast;
        if (iLast < 0) return 0;
        int iFirst = iLast;
        while (iFirst >= 0 && s.charAt(iFirst) != ' ') --iFirst;
        return iLast - iFirst;
    }
}
