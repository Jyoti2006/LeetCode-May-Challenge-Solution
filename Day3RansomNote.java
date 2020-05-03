class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] count = new int[128];
        for(char c: magazine.toCharArray()){
            ++count[c];
        }
        for(char r:ransomNote.toCharArray()){
            if(--count[r]<0)
                return false;
        }
        return true;
    }
}