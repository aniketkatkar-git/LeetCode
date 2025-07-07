class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs);
        String firstStr = strs[0];
        String lastStr = strs[strs.length - 1];

        StringBuilder longestCommPrefix = new StringBuilder();
        for (int i = 0; i < Math.min(firstStr.length(), lastStr.length()); i++) {
            if (firstStr.charAt(i) != lastStr.charAt(i)) {
                return longestCommPrefix.toString();
            }
            longestCommPrefix.append(firstStr.charAt(i));
        }
        return longestCommPrefix.toString();
    }
}
