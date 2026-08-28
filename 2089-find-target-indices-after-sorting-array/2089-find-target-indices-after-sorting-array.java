class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> x=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                x.add(i);
            }
        }
        return x;
    }
}
