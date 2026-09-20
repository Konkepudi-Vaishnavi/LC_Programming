class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int nl1 = nums1.length;
        int nl2 = nums2.length;
        int i = 0, j = 0;

        while (i < nl1 && j < nl2) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }
        return -1;
    }
}