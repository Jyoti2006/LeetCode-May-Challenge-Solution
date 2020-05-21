class Solution {
    public int countSquares(int[][] matrix) {
        if(matrix.length<1)
            return 0;
        int c=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                if(i==0 || j==0){
                    if(matrix[i][j]==1)
                        c++;
                    continue;
                }
                else{
                     if(matrix[i][j]==1){
                         matrix[i][j]=matrix[i][j]+Math.min(Math.min(matrix[i-1][j],matrix[i][j-1]),matrix[i-1][j-1]);
                         c+=matrix[i][j];
                     }
                }
            }
        }
        return c;
    }
}