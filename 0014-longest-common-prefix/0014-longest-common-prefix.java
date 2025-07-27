class Solution {

    public String longestCommonPrefix(String[] strs) {
        // Sort the strings
        Arrays.sort(strs);

        // Assume first word in the array is the prefix
        String first = strs[0];
        String last = strs[strs.length - 1];

        // Compare this prefix with each of the remaining strings.
        // At each comparison, shrink the prefix if the current string doesn't start with it.
        while (!last.startsWith(first)) {
            first = first.substring(0, first.length() - 1);
        }

        return first;
    }
}
