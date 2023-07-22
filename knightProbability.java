class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        int[][] dir = {{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};
        // We use dynamic programming to store the probabilities at each cell for each move...
        // The dp array is a 3-dimensional array...
        // dp[i][r][c] represents the probability of the knight being at cell (r, c) after i moves...
        double[][][] dp = new double[k + 1][n][n];
        // At first, initialize dp[0][row][column] to 1.0, as the knight starts at the specified cell.
        dp[0][row][column] = 1.0;
        // For each move from 1 to k, the algorithm iterates over each cell on the chessboard.
        for (int i = 1; i <= k; i++) {
            // For each cell, it considers all 8 possible moves of the knight &
            // Calculates the probability of reaching that cell from the neighboring cells.
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    for (int[] d : dir) {
                        // Introduce the terms newRow & newCol...
                        int newRow = r + d[0];
                        int newCol = c + d[1];
                        // If the new cell is within the bounds of the chessboard....
                        if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n) {
                            // update by adding the probability of the previous move divided by 8.0...
                            dp[i][r][c] += dp[i - 1][newRow][newCol] / 8.0;
                        }
                    }
                }
            }
        }
        // Initialize the output probability...
        double output = 0.0;
        // Sum up the output probabilities of all cells at the kth move to get the final output probability.
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                output += dp[k][r][c];
            }
        }
        // return the output that the knight remains on the board after k moves.
        return output;
    }
}