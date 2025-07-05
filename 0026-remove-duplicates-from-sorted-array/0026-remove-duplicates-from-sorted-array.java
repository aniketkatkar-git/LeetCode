class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // pointer for the position of unique elements

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;              // move to next unique position
                nums[i] = nums[j]; // copy the new unique element
            }
        }

        return i + 1; // k = number of unique elements
    }
}