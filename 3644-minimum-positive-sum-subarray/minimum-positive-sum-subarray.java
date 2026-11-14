import java.util.*;
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }
        long ans = Long.MAX_VALUE;
        TreeMap<Long, Integer> map = new TreeMap<>();
        for (int i = l; i <= n; i++) {
            long add = prefix[i - l];
            map.put(add, map.getOrDefault(add, 0) + 1);
            if (i - r - 1 >= 0) {
                long remove = prefix[i - r - 1];

                if (map.get(remove) == 1) {
                    map.remove(remove);
                } else {
                    map.put(remove, map.get(remove) - 1);
                }
            }
            Long candidate = map.lowerKey(prefix[i]);
            if (candidate != null) {
                ans = Math.min(ans, prefix[i] - candidate);
            }
        }
        return ans == Long.MAX_VALUE ? -1 : (int) ans;
    }
}
