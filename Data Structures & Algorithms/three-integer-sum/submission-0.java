class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        temp.add(nums[i]);                        
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        System.out.println("btemp"+temp);
                        if(!res.contains(temp)){
                            res.add(new ArrayList<>(temp));
                        }
                        
                        System.out.println("res"+res);
                        temp.removeAll(temp);
                        System.out.println("temp"+temp);
                    }
                }
            }
        }

        return res;
    }
}
