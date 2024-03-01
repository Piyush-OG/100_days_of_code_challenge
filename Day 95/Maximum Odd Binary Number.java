class Solution {
    public String maximumOddBinaryNumber(String s) {
        char ch[]= s.toCharArray();
        Arrays.sort(ch);
        int i,j=ch.length-2;
        for(i=0;i<j;i++){
            //System.out.println(i+" "+j);
            if(ch[i]!=ch[j]){
                ch[j]='0';
                ch[i]='1';
                j--;
            }else{
                break;
            }
        }
        String ans= new String(ch);
        return ans;
    }
}
