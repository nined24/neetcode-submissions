class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String regex = "[^a-zA-Z0-9]"; 
        
        String cs = s.replaceAll(regex, "");
        char[] c = cs.toCharArray();
        int j=c.length-1;
        int i=0;
        while(i<=j){
            if(c[i]!=c[j]){
                System.out.print(i+c[i]+" "+c[j]+j);
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
