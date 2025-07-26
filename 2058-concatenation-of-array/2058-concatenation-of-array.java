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

        // System.arraycopy(Source array, Start index in the source array, Destination array, Start index in the destination array, Number of elements to copy);
        System.arraycopy(nums, 0, ans, 0, n); // Copy to first half
        System.arraycopy(nums, 0, ans, n, n); // Copy to second half

        // Return the concatenated result array
        return ans;
    }
}
