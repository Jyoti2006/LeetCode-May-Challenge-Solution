class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
       int l= coordinates.length;
        if(l==0)
            return false;
        int m=0;
        int c1x=coordinates[1][0]-coordinates[0][0];
        int c1y=coordinates[1][1]-coordinates[0][1];
        if(c1x!=0)
            m=c1y/c1x;
            int con=coordinates[1][1]-(m*coordinates[1][0]);
            for(int i=0;i<l;i++){
                int y=(m*coordinates[i][0])+con;
                if(y!=coordinates[i][1])
                    return false;
            }
            return true;
        }
}