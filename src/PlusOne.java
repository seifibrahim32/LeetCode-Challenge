import java.math.BigInteger;

public class PlusOne {
    static class Solution {
        public int[] plusOne(int[] digits) {
            StringBuilder str=new StringBuilder();

            for(Integer x:digits) str.append(x);

            BigInteger b = new BigInteger(str.toString());
            b = b.add(new BigInteger("1"));
            String s = b.toString();

            int[] arr =new int[s.length()];

            for (int i = 0; i < arr.length ; i++){
                arr[i]=s.charAt(i)-'0';
            }
            return arr;
        }
    }
}
