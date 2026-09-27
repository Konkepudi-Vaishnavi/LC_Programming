class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) return 0;

        int total = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            int current = timeSeries[i];
            int next = timeSeries[i + 1];

            if (next < current + duration) {
                total += (next - current);
            } else {
                total += duration;
            }
        }


        total += duration;
        return total;
    }
}