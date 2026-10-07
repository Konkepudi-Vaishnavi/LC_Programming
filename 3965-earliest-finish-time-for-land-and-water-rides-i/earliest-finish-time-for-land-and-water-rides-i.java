class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                long f1 = Math.max(
                        waterStartTime[j],
                        landStartTime[i] + landDuration[i]
                ) + waterDuration[j];
                long f2 = Math.max(
                        landStartTime[i],
                        waterStartTime[j] + waterDuration[j]
                ) + landDuration[i];
                ans = Math.min(ans, Math.min(f1, f2));
            }
        }
        return (int) ans;
    }
}