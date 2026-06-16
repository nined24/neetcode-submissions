class Solution {
    public boolean hasDuplicate(int[] nums) {
        int s=nums.length,i=0,num1,num2,j;

        while(i<s){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}