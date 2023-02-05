import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    class Solution {
        public int singleNumber(int[] nums) {

            Map<Integer,Integer> numbers = new HashMap<Integer,Integer>();

            int i = 0 ;

            for(i = 0 ; i < nums.length; i++){
                numbers.put(nums[i],numbers.containsKey(nums[i]) ?
                        numbers.get(nums[i])+1:1);
            }

            for(i = 0 ; i < nums.length; i++){
                if(numbers.get(nums[i])==1) return nums[i];
            }
            return 1;
        }
    }
}
