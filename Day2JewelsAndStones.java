class Solution {
    public int numJewelsInStones(String J, String S) {
        boolean[] isJewel=new boolean[127];
        int ans=0;
        for(char c:J.toCharArray()){
            isJewel[c]=true;
        }
        for(char a:S.toCharArray()){
            if(isJewel[a])
                ans++;
        }
        return ans;
    }
}