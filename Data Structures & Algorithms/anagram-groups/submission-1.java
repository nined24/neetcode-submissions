class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        String s2;
        for(String str:strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String s1 = new String(c);
            if(temp.contains(s1)){
                res.get(temp.indexOf(s1)).add(str);
            }
            else{
                temp.add(s1);
                List<String> l = new ArrayList<>();
                l.add(str);
                res.add(l);
            }
        }
        return res;
    }
}
