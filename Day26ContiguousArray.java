class Solution {
    public int findMaxLength(int[] nums) {
        int res=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,0);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                sum+=-1;
            else
                sum+=1;
            if(map.get(sum)==null)
                map.put(sum,i+1);
            else
                res=Math.max(res,(i+1)-map.get(sum));
        }
        return res;
    }
}