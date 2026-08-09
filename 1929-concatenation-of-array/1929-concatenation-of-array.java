class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int x=0;
        int ans[]=new int[2*n];
        for(int z:nums){
                ans[x]=z;
                ans[x+n]=z;
                x++;
            }
        return ans;
    }
}