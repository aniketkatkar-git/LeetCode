class Solution {

    public boolean containsDuplicate(int[] nums) {
        // If array is empty or has only one element, no duplicates are possible
        if (nums.length <= 1) {
            return false;
        }

        // Sort the array to bring duplicates next to each other
        Arrays.sort(nums);

        // Iterate through the array and check for adjacent duplicates
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Found duplicate
            }
        }

        // No duplicates found
        return false;
    }
}
