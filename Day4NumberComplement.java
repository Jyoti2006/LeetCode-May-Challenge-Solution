class Solution {
    public int findComplement(int num) {
        int i=0, ans=0;
        while(num>0){
            if((1 & num)==0)
                ans+=Math.pow(2,i);
            i++;
            num>>=1;
        }
        return ans;
    }
}