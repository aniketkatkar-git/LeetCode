class Solution {

    public boolean containsDuplicate(int[] nums) {
        // Use a HashSet to keep track of seen elements
        Set<Integer> set = new HashSet<>();

        // Iterate through the array
        for (int num : nums) {
            // If the number is already in the set, we found a duplicate
            if (!set.add(num)) {
                return true; // Duplicate found
            }
        }

        // No duplicates found
        return false;
    }
}
