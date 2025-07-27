class Solution {

    public int removeElement(int[] nums, int val) {
        // Pointer k keeps track of the next position to place a non-val element
        int k = 0;

        // Pointer k keeps track of the next position to place a non-val element
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Copy the element to the position k
                nums[k] = nums[i];
                // Move k to the next position
                k++;
            }
        }

        // Return the count of elements that are not equal to val
        return k;
    }
}
