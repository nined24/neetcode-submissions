class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] r = new int[nums.length];
        int res=1;
        for(int i=0;i<nums.length;i++){
            res=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    res=res*nums[j];
                }
            }
            r[i]=res;
        }
        return r;
    }
}  
