public class RotateArray {
    class Solution {
        public void rotate(int[] nums, int k) {
            k = k % nums.length;
            int N = nums.length;
            int[] rotatedArray = new int[N];
            int mid = N/2;

            for(int i = 0 ; i < N ;i++){
                rotatedArray[(i+k) % N] = nums[i];
            }

            for (int i = 0; i < nums.length; i++) {
                nums[i] = rotatedArray[i];
            }
        }
    }
}
