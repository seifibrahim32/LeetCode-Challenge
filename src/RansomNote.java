
public class RansomNote {
    public class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            if (ransomNote.length() > magazine.length()){
                return false;
            }
            Map<Character, Integer> counts = new HashMap<>();
            for (char c : magazine.toCharArray()) {
                int count = counts.containsKey(c) ? counts.get(c) + 1 : 1;
                counts.put(c, count);
            }
            for (char c : ransomNote.toCharArray()) {
                int newCount = counts.containsKey(c) ? counts.get(c) - 1 : -1;
                if (newCount == -1) return false;
                counts.put(c, newCount);
            }
            return true;
        }
    }
}
