class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int pi1 = 2; 
        int pi2 = 1; 

        for (int i = 3; i <=n; i++) {
            int cur = pi1 + pi2;
            pi2 = pi1;
            pi1 = cur;
        }

        return pi1;
    }
}