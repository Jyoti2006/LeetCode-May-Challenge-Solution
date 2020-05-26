class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        if(A==null || A.length==0 || B==null || B.length==0)
            return new int[][]{};
        List<int[]> result=new ArrayList<>();
        int i=0,j=0;
        int m=A.length, n=B.length, low, high;
        while((i<m) && (j<n)){
            low=Math.max(A[i][0],B[j][0]);
            high=Math.min(A[i][1],B[j][1]);
            if(low<=high)
                result.add(new int[]{low,high});
            if(A[i][1]<B[j][1])
                i++;
            else
                j++;
        }
        return result.toArray(new int[result.size()][]);
    }
}