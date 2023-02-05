public class ContainsDuplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {

            Map<Integer,Integer> numbers = new HashMap<Integer,Integer>();

            int i = 0 ;

            for(i = 0 ; i < nums.length; i++){
                numbers.put(nums[i],numbers.containsKey(nums[i]) ?
                        numbers.get(nums[i])+1:1);
            }

            for(i = 0 ; i < nums.length; i++){

                if(numbers.get(nums[i])>1) return true;

                else if(numbers.get(nums[i])<1) break;
            }
            return false;
        }
    }
}
