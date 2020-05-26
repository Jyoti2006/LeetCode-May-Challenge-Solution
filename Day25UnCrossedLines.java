class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        return lcs(new HashMap<String,Integer>(),0,0,A,B);
    }
    private int lcs(HashMap<String,Integer> m, int i, int j,int[] A, int[] B){
        if(i>=A.length || j>=B.length) return 0;
        String p=i+" "+j;
        if(m.containsKey(p)) return m.get(p);
        int a=0;
        if(A[i]==B[j]) a=1+lcs(m,i+1,j+1,A,B);
        else
            a=Math.max(lcs(m,i+1,j,A,B), lcs(m,i,j+1,A,B));
        m.put(p,a);
        return a;
        }
        
}