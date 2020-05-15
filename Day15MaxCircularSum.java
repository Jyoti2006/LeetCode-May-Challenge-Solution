class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int curr_max = A[0];
        int max = A[0];
        int curr_min = A[0];
        int min = A[0];
        int total = A[0];
        
        for(int i=1;i<A.length;i++) {
            curr_max = curr_max+A[i];
            curr_min = curr_min+A[i];
            if(curr_max<A[i]) {
                curr_max = A[i];
            }
            if(curr_max>max) {
                max = curr_max;
            }
            
            if(curr_min>A[i]) {
                curr_min = A[i];
            }
            if(min>curr_min) {
                min = curr_min;
            }            
            total = total+A[i];
        }
        
        return max<0? max :Math.max(max,total-min);     
    }
}