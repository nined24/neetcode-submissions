class Solution {
    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        List<Character> temp = new ArrayList<>();
        ArrayList<Character> chars = new ArrayList<>(List.of('a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'));
        for(int i=0;i<c.length;i++){
            if(chars.contains(c[i])){
                temp.add(Character.toLowerCase(c[i]));
            }   
        }
        int i=0,j=temp.size()-1;
        System.out.println(temp);
        System.out.println(j);
        while(j-i>=1){
            if(temp.get(i)!=temp.get(j)){
                System.out.print(temp.get(i)+" "+temp.get(j)+j);
                return false;
            }
            else{
                i++;
                j--;
            }
        }

        if(temp.size()==2){
            if(Character.toLowerCase(temp.get(0))!=Character.toLowerCase(temp.get(1))){
                return false;
            }
        }
        return true;
    }
}
