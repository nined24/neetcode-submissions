class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        int j=0,diff;
        Hashtable<Integer,Integer> h = new Hashtable<>();
        for(int num=0;num<nums.length;num++){
            diff=target-nums[num];
            
            if(h.containsKey(diff)){
                System.out.println(diff);
                int a=h.get(diff);
                res[0]=a;
                res[1]=num;
                return res;
            }
            else{
                h.put(nums[num],num);
            }
        }
        return res;
    }
}
