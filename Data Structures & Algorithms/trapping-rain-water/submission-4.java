class Solution {
    int min(int a,int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }

    public int trap(int[] height) {
        int res=0;
        boolean h=false;

        for(int i=1;i<height.length-1;i++){
            int temp;
            int l=0,r=0;
            for(int j=i-1;j>=0;j--){
                if(height[j]>l){
                    l=height[j];
                }
            }   
            for(int k=i+1;k<height.length;k++){
                if(height[k]>r){
                    r=height[k];
                }
            }
            temp=min(l,r)-height[i];
            if(temp>0){
                res=res+temp;
            }
        }
        return res;
    }
}
