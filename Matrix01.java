import java.util.*;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        int rows = mat.length;
        int cols = mat[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new int[]{i, j});
                } else {
                    mat[i][j] = -1;
                }
            }
        }
        
        int[] dirX = {1, -1, 0, 0};
        int[] dirY = {0, 0, 1, -1};
        
        int length = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            length++;
            while (size-- > 0) {
                int[] front = q.poll();
                int r = front[0];
                int c = front[1];
                for (int i = 0; i < 4; i++) {
                    int newRow = r + dirX[i];
                    int newCol = c + dirY[i];
                    if (newRow < 0 || newCol < 0 || newRow >= rows || newCol >= cols || mat[newRow][newCol] >= 0) {
                        continue;
                    }
                    mat[newRow][newCol] = length;
                    q.offer(new int[]{newRow, newCol});
                }
            }
        }
        
        return mat;
    }
}