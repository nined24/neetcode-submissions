class Solution {
    public int maxArea(int[] heights) {
        int a,b,res=0,tempres;
        for(int i=0;i<heights.length-1;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]>heights[j]){
                    a=heights[j];
                }
                else{
                    a=heights[i];
                }
                b=j-i;
                tempres=a*b;
                if(tempres>res){
                    res=tempres;
                }
            }
        }
        return res;
    }
}
