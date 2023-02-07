public class MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {

            if(nums.length <= 0 ){
                return;
            }
            int[] movedZeroes = new int[nums.length];

            int j = 0;

            for(int i = 0 ; i < nums.length ;i++){
                if(nums[i] != 0){
                    movedZeroes[j] = nums[i];
                    j++;
                }
            }

            for(int i = 0 ; i < nums.length ;i++){
                nums[i] = movedZeroes[i];
            }
        }
    }
}
