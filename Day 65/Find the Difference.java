class Solution {
    public int stringSum (String str){
        int sum = 0;
        for(int i = 0; i< str.length(); i++)
            sum += (int) str.charAt(i);
        return sum;
    }
    public char findTheDifference(String s, String t) {
        return (char) (stringSum(t) - stringSum(s));
    }
}
