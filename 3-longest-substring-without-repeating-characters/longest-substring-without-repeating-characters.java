import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        
        int maxLength = 0;
        int start = 0; 
        for (int end = 0; end < s.length(); end++) {
        
            while (window.contains(s.charAt(end))) {
                window.remove(s.charAt(start)); 
                start++;
            }
            window.add(s.charAt(end));
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}