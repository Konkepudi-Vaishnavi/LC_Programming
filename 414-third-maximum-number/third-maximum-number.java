import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {

        int[] nums2 = Arrays.stream(nums)
                            .distinct()
                            .toArray();

        Arrays.sort(nums2);

        if (nums2.length >= 3) {
            return nums2[nums2.length - 3];
        } 
        else {
            return nums2[nums2.length - 1];
        }
    }
}