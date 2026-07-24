class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int count=1,temp=0,res=1;
        
        if(nums.length==0){
            return 0;
        }

        for(int num:nums){
            h.add(num);
        }

        for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i]-1)){
                continue;
            }
            temp=nums[i];
            while(h.contains(temp+1)){
                System.out.print(i);
                temp++;
                count++;
            }
            if(res<count){
                res=count;
            }
            count=1;
        }
        return res;
    }
}
