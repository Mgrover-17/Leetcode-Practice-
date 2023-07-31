import java.util.Arrays;

class Solution {
    int[][] dp;

    public int minimumDeleteSum(String s1, String s2) {
        dp = new int[s1.length() + 1][s2.length() + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(s1, s2, 0, 0);
    }

    private int solve(String s1, String s2, int i, int j) {
        if (dp[i][j] != -1)
            return dp[i][j];
        if (i == s1.length()) {
            int sum = 0;
            for (int k = j; k < s2.length(); k++) {
                sum += s2.charAt(k);
            }
            return sum;
        }
        if (j == s2.length()) {
            int sum = 0;
            for (int k = i; k < s1.length(); k++) {
                sum += s1.charAt(k);
            }
            return sum;
        }
        int nt = Math.min(s1.charAt(i) + solve(s1, s2, i + 1, j), s2.charAt(j) + solve(s1, s2, i, j + 1));
        int tk = Integer.MAX_VALUE;
        if (s1.charAt(i) == s2.charAt(j)) {
            tk = solve(s1, s2, i + 1, j + 1);
        }
        return dp[i][j] = Math.min(nt, tk);
    }
}