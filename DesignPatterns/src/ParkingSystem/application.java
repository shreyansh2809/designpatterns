package ParkingSystem;

import java.util.LinkedList;
import java.util.Queue;

public class application {


}


class ShortestPathInGrid {
    // Define directions for moving horizontally, vertically, and diagonally
    private static final int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static int shortestDistance(int[][] grid, int x, int y, int des_x, int des_y) {
        int n = grid.length;
        int m = grid[0].length;

        // Visited array to keep track of visited cells
        boolean[][] visited = new boolean[n][m];
        visited[x][y] = true;

        // Queue for BFS traversal
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y, 0}); // Add the source cell with distance 0

        // Perform BFS
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curr_x = current[0];
            int curr_y = current[1];
            int dist = current[2];

            // Check if the destination is reached
            if (curr_x == des_x && curr_y == des_y) {
                return dist;
            }

            // Explore all 8 possible directions
            for (int i = 0; i < 8; i++) {
                int new_x = curr_x + dx[i];
                int new_y = curr_y + dy[i];

                // Check if the new position is within the grid and unvisited
                if (new_x >= 0 && new_x < n && new_y >= 0 && new_y < m &&
                        grid[new_x][new_y] == 1 && !visited[new_x][new_y]) {
                    visited[new_x][new_y] = true;
                    queue.offer(new int[]{new_x, new_y, dist + 1});
                }
            }
        }

        // If destination is not reachable
        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1}
        };
        int x = 0, y = 0; // Source cell
        int des_x = 4, des_y = 4; // Destination cell

        int shortestDist = shortestDistance(grid, x, y, des_x, des_y);
        if (shortestDist != -1) {
            System.out.println("Shortest distance from source to destination: " + shortestDist);
        } else {
            System.out.println("Destination is not reachable from the source.");
        }
    }
}