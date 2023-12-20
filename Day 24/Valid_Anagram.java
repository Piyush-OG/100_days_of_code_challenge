class Solution {
    public boolean isAnagramUsingBruteForce(String s, String t) {
        
        if (s.length() != t.length()){
            return false;
        }
        else if(s.isEmpty()){
            return true;
        }
        
        boolean isAnagram = false;
        
        boolean [] visited = new boolean[t.length()];
        
        for(int i=0; i<s.length(); i++){
            isAnagram = false;
            
            for(int j=0; j<t.length(); j++){
                if(s.charAt(i) == t.charAt(j) && !visited[j]){
                    isAnagram = true;
                    visited[j] = true;
                    break;
                }
            }
            
            if(!isAnagram){
                return false;
            }
        }
        
        return isAnagram;
    }
   
    public boolean isAnagramUsingSorting(String s, String t) {
        
		// length check
        if (s.length() != t.length()){
            return false;
        }
		else if(s.isEmpty()){ // empty string check
            return true;
        }
        
        char [] ch1 = s.toCharArray();
        char [] ch2 = t.toCharArray();
        
		// sort both arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);
		
        return Arrays.equals(ch1, ch2); 
    }
    
    public boolean isAnagram(String s, String t) {
        
        int [] charCount = new int[128];
        
        for (int i=0; i<s.length(); i++){
            charCount[s.charAt(i)]++;
        }
        
        for (int i=0; i<t.length(); i++){
            charCount[t.charAt(i)]--;
        }
        
        for (int i=0;i<128;i++){
            if(charCount[i] != 0){
                return false;
            }
        }
        
        return true;
    }
}
