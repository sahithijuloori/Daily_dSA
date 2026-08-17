class Solution {
    public int[] productExceptSelf(int[] nums) {
        int x=nums.length;
        int[] ans=new int[x];
        int[] left=new int[x];
        int[] right=new int[x];
        left[0]=1;
        right[x-1]=1;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        for(int j=x-2;j>=0;j--){
            right[j]=right[j+1]*nums[j+1];
        }
        for(int k=0;k<nums.length;k++){
            ans[k]=left[k]*right[k];
        }
        return ans;
    }
}