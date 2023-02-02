class Solution {
    public int[] runningSum(int[] nums) {
        if(nums.length <=2){
            nums[1] = nums[0] + nums[1];
            return nums;
        }
        else {
            int sum = nums[0];
            for(int i = 1 ; i < nums.length; i++){
                nums[i] = sum + nums[i];
                sum = nums[i];
            }
            return nums;
        }
    }
}