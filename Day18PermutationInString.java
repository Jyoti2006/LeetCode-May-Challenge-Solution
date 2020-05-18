class Solution {
    public boolean checkInclusion(String p, String s) {
         int[] lp=new int[26];
        int len=p.length()-1;
        int[] d=new int[26];
        List<Integer> res=new ArrayList<Integer>();
        for(char c:p.toCharArray()){
            lp[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            d[s.charAt(i)-'a']++;
            if(i>=len){
                if(isSame(lp,d)){
                    return true;
                }
                d[s.charAt(i-len)-'a']--;
            }
        }
        return false;
    }
    
     private boolean isSame(int[] lp, int[] d){
        for(int i=0;i<26;i++)
            if(lp[i]!=d[i])
                return false;
        return true;
    }
}