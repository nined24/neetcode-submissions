class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for (int element : nums) {
            h.add(element);
        }
        int res=0,count=0,temp;
        boolean loop=true;
        for(int i=0;i<nums.length;i++){
            loop=true;
            count=1;
            temp=nums[i]+1;
            System.out.println(temp);
            while(loop){
                System.out.println(h);
                System.out.println(temp);
                if(h.contains(temp)){
                    System.out.println("*");
                    count++;
                    temp++;
                }
                else{
                    loop=false;
                }
            }
            if(res<count){
                res=count;
            }
        }
        return res;
    }
}
