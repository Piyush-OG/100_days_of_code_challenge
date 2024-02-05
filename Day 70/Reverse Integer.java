class Solution {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(""+x);
        sb.reverse();
        String str = sb.toString();
        
        if(str.charAt(str.length()-1) == '-') {
            str = "-" + str.substring(0, str.length()-1);
        }
        int ans = 0;
        
        try{
            ans = Integer.parseInt(str);
        } catch(Exception ex){
            return 0;
        }
        
        return ans;
    }
}
