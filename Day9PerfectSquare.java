class Solution {
    public boolean isPerfectSquare(int num) {
        double r=Math.sqrt(num);
        return ((r-Math.floor(r))==0);
    }
}