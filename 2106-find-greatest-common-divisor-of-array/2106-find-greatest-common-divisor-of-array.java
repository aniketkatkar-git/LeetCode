class Solution {

    public int findGCD(int[] nums) {
        int smallestNum = nums[0];
        int largestNum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallestNum) {
                smallestNum = nums[i];
            }
            if (nums[i] > largestNum) {
                largestNum = nums[i];
            }
        }
        return findGCDOfTwoNumbers(smallestNum, largestNum);
    }

    private int findGCDOfTwoNumbers(int n1, int n2) {
        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }

        if (n2 == 0) {
            return n1;
        } else {
            return n2;
        }
    }
}
