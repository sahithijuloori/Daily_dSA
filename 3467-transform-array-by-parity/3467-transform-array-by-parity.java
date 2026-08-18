class Solution {
    public int[] transformArray(int[] nums) {
       for(int k=0;k<nums.length;k++){
            if(nums[k]%2==0){
                nums[k]=0;
            }
            else{
                nums[k]=1;
            }
        }
        
        
        
        Arrays.sort(nums);
        return nums;
        
    }
}