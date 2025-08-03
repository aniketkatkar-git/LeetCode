class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int currentStreak = 0; // length of the current run of 1s
        int maxStreak = 0; // longest run seen so far

        for (int num : nums) {
            if (num == 1) {
                // extend current streak
                currentStreak++;

                // update maximum if this streak is now longer
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                // reset current streak when encountering 0
                currentStreak = 0;
            }
        }

        return maxStreak;
    }
}
