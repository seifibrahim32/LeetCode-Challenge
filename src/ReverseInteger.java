public class ReverseInteger {
    class Solution {
        public int reverse(int x) {
            String sign = String.valueOf(x).substring(0,1);
            long absX = Math.abs((long)x);
            int length =  String.valueOf(absX).length();
            StringBuilder reverse= new StringBuilder();
            for(int i = 0;i < length ; i++) {
                reverse.append(absX % (10));
                absX = absX / (10);
            }
            if(reverse.toString().equals("")){

                reverse = new StringBuilder("0");

            }
            return Long.parseLong(reverse.toString()) > Integer.MAX_VALUE ? 0:

                    sign.equals("-")? -Integer.parseInt(reverse.toString()):Integer.parseInt(reverse.toString());
        }
    }
}
