class Solution {
    public String encode(List<String> strs) {
        String s="";
        for(String str:strs){
            s=s+str+"`";
        }
        return s;
    }

    public List<String> decode(String str) {
        char[] c = str.toCharArray();
        StringBuilder sb=new StringBuilder();
        List<String> res = new ArrayList<>();
        String s;
        for(char c1:c){
            String st;
            if(c1!='`'){
                sb.append(c1);
            }
            else{
                res.add(sb.toString());
                sb.delete(0,sb.length());
            }
        }
        System.out.println(sb);
        return res;
    }
}
