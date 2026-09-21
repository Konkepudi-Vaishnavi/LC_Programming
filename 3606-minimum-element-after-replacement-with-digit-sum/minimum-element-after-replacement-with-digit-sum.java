class Solution {
    public int minElement(int[] nums) {
        int minval = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            minval = Math.min(minval, sum);
        }

        return minval;
    }
}