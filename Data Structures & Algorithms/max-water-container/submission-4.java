class Solution {
    public int maxArea(int[] heights) {
        int res=0,temp;
        int i=0,j=heights.length-1;
        while(i<j){
            if(heights[i]<heights[j]){
                temp=heights[i]*(j-i);
            }
            else{
                temp=heights[j]*(j-i);
            }
            if(res<temp){
                res=temp;
            }
            if(heights[i]>heights[j]){
                j--;
            }
            else if(heights[i]<heights[j]){
                i++;
            }
            else{
                if(heights[i+1]>heights[j-1]){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return res;
    }
}
