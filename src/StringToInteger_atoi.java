public class StringToInteger_atoi{
    class Solution {
        public int myAtoi(String str) {

            if (str == null || str.length() < 1) {
                return 0;
            }
            // MAX and MIN values for integers
            final int INT_MAX = Integer.MAX_VALUE;
            final int INT_MIN = Integer.MIN_VALUE;
            // Trimmed string
            str = str.replaceAll("^\\s+", "");
            // Counter
            int i = 0;
            // Flag to indicate if the number is negative
            boolean isNegative = str.startsWith("-");
            // Flag to indicate if the number is positive
            boolean isPositive = str.startsWith("+");
            if (isNegative) {
                i++;
            } else if (isPositive) {
                i++;
            }
            // This will store the converted number
            double number = 0;
            // Loop for each numeric character in the string iff numeric characters are leading
            // characters in the string
            while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                number = number * 10 + (str.charAt(i) - '0');
                i++;
            }
            // Give back the sign to the converted number
            number = isNegative ? -number : number;
            if (number < INT_MIN) {
                return INT_MIN;
            }
            if (number > INT_MAX) {
                return INT_MAX;
            }
            return (int) number;
        }
    }
}
