import java.util.*;
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n]; 
        for (int num : nums) {
            freq[num]++;
        } 
        int[] result = new int[2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2) {
                result[index++] = i;
                if (index == 2) break;
            }
        }
        return result;
    }
}