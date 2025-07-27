class Solution {

    public boolean isAnagram(String s, String t) {
        // If the lengths of the strings are not equal, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Count frequency of each character in string s
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Decrease frequency based on characters in string t
        for (char ch : t.toCharArray()) {
            if (!freqMap.containsKey(ch)) {
                return false;
            }

            freqMap.put(ch, freqMap.get(ch) - 1);
            if (freqMap.get(ch) < 0) {
                return false;
            }
        }

        return true;
    }
}
