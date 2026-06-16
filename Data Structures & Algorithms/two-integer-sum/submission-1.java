class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j;
        int res[]=new int[2];
        while(i<nums.length){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
                
            }
            i++;
        }
        return res;
    }
}
