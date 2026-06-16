class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int i;
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        for(String str:strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String s1 = new String(c);
            System.out.println(s1);
            if(temp.contains(s1)){
                System.out.println(temp);
                res.get(temp.indexOf(s1)).add(str);
            }
            else{
                temp.add(s1);
                List<String> lr = new ArrayList<>();
                lr.add(str);
                res.add(lr);
            }
        }
        System.out.println(temp);
        return res;
    }
}
