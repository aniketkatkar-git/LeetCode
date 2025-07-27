class Solution {

    public boolean isAnagram(String s, String t) {
        // If the lengths of the strings are not equal, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create a count array to store the frequency of each character
        // Assuming input contains only lowercase English letters ('a' to 'z')
        int[] count = new int[26];

        // Increment count for each character in string 's'
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Decrement count for each character in string 't'
        for (int j = 0; j < t.length(); j++) {
            count[t.charAt(j) - 'a']--;
        }

        // If all counts are zero, then strings are anagrams
        for (int k = 0; k < count.length; k++) {
            if (count[k] != 0) {
                return false; // Found mismatch in character frequency
            }
        }

        return true; // All characters match in frequency
    }
}
