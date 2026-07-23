class Solution {
    public int[] productExceptSelf(int[] nums) {
        int m=1;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    m=m*nums[j];
                }
            }
            res[i]=m;
            m=1;
        }
        return res;
    }
}  
