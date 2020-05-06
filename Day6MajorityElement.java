class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==0)
            return 0;
        int res=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(res==nums[i])
                count++;
            else{
                if(count>0)
                    count--;
                else if(count==0){
                    res=nums[i];
                    count++;
                }
                
            }
        }
        return res;
    }
}