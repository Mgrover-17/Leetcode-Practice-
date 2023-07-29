import java.util.Arrays;

class Solution {
    private int[] optionA = {100, 75, 50, 25};
    private int[] optionB = {0, 25, 50, 75};

    private double solve(int a, int b, double[][] dp) {
        if (a == 0 && b == 0)
            return 0.5; // half the probability that A and B become empty at the same time
        if (a == 0)
            return 1;
        if (b == 0)
            return 0;

        if (dp[a][b] != -1)
            return dp[a][b];

        double ans = 0;
        for (int k = 0; k < 4; k++) {
            int rema = a - optionA[k];
            int remb = b - optionB[k];
            ans += 0.25 * solve(Math.max(0, rema), Math.max(0, remb), dp);
        }

        return dp[a][b] = ans;
    }

    public double soupServings(int n) {
        if (n >= 4800)
            return 1;
        double[][] dp = new double[n + 1][n + 1];
        for (double[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(n, n, dp);
    }
}