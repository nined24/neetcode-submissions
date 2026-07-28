class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<Integer> lr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(k>j){
                if(nums[i]+nums[k]+nums[j]==0){
                    lr.add(nums[i]);
                    lr.add(nums[j]);
                    lr.add(nums[k]);
                    if(!res.contains(lr)){
                        res.add(lr);
                    }
                    lr=new ArrayList<>();
                    k--;
                    j++;
                }
                if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                    // System.out.print(nums[i]+" "+nums[j]+nums[k]+" "+res);
                }
                if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                    // System.out.print(nums[i]+" "+nums[j]+nums[k]);
                }
            }
        }
        return res;
    }
}