class Solution {

    public int[] getConcatenation(int[] nums) {
        // Get the length of the 'nums' array and store it in variable 'n'
        int n = nums.length;

        // Handle the edge case where the input array is empty
        if (n == 0) {
            return new int[0];
        }

        // Declare an array of size 2n to store the concatenated elements
        int[] ans = new int[2 * n];

        // Iterate through 'nums' and copy each element twice in the 'ans' array
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[n + i] = nums[i];
        }

        // Return the concatenated result array
        return ans;
    }
}
