class Solution {
    public int findJudge(int N, int[][] trust) {
        int c[]=new int[N+1];
        for(int t[]:trust){
            if(c[t[1]]>=0)
                c[t[1]]++;
            c[t[0]]=-1;
        }
        for(int i=1;i<=N;i++)
            if(c[i]==N-1)
                return i;
         return -1;
    }
   
}