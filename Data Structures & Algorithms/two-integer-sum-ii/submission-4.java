class Solution {
    public int[] twoSum(int[] numbers, int target) {
        List<Integer> h = new ArrayList<>();
        for(int n:numbers){
            h.add(n);
        }
        int[] res = new int[2];
        for(int i=0;i<h.size();i++){
            if(h.contains(target-numbers[i])){
                res[0]=i+1;
                res[1]=h.indexOf(target-numbers[i])+1;
                break;
            }    
        }
        return res;
    }
}
