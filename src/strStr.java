public class strStr {
    class Solution {
        public int strStr(String haystack, String needle) {

            haystack = haystack.toLowerCase();

            needle = needle.toLowerCase();

            if (haystack == null || needle == null) {
                return -1;
            }

            if (haystack.equals(needle)) {
                return 0;
            }

            int needleLength = needle.length();

            int haystackLength = haystack.length();

            for (int i = 0; i < haystackLength - needleLength + 1; i++) {

                if (haystack.substring(i, i + needleLength).equals(needle)) {
                    return i;
                }

            }
            return -1;

        }
    }
}
