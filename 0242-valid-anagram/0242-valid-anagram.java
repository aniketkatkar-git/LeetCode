class Solution {

    public boolean isAnagram(String s, String t) {
        // If the lengths of the strings are not equal, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert both strings to character arrays
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        // Sort both character arrays
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        // Convert sorted character arrays back to strings
        String sStr = new String(sChar);
        String tStr = new String(tChar);

        // Compare both sorted strings
        return sStr.equals(tStr);
    }
}
