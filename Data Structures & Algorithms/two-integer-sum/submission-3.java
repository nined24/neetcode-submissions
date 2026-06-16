class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> h = new ArrayList<>();
        int[] res = new int[2];
        int temp;
        for(int i=0;i<nums.length;i++){
            // System.out.println(i+" "+nums[i]+" "+target-nums[i]);
            if(h.contains(target-nums[i])){
                temp = h.indexOf(target-nums[i]);
                System.out.println(temp+" "+i);
                res[0] = temp;
                res[1] = i;
                break;
            }
            else{
                h.add(nums[i]);
            }
        }
        return res;
    }
}
