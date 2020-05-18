class Solution {
    public List<Integer> findAnagrams(String s, String p) {
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
                if(isAnagram(lp,d)){
                    res.add(i-len);
                }
                d[s.charAt(i-len)-'a']--;
            }
        }
        return res;
    }
    
    private boolean isAnagram(int[] lp, int[] d){
        for(int i=0;i<26;i++)
            if(lp[i]!=d[i])
                return false;
        return true;
    }
}