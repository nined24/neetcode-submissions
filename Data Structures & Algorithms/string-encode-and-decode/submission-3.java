class Solution {
    public String encode(List<String> strs) {
        String s = new String();
        
        for(String str:strs){
            s=s+str+"`";
        }
        return s;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        char[] s = str.toCharArray();
        String[] c = new String[s.length];

        for(int j=0;j<s.length;j++){
            c[j]=String.valueOf(s[j]);
        }
        
        int i=0;
        StringBuilder sb = new StringBuilder();
        String r;
        String s4="`";
        String t2="a";
        while(i<c.length){
            System.out.print(c[i]);
            t2=c[i];
            if(t2.equals(s4)){
                r=sb.toString();
                System.out.print(c[i]);
                sb.setLength(0);
                res.add(r);
            }
            else{
                sb.append(c[i]);
            }
            
            i++;
        }

        return res;
    }
}
