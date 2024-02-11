package main.java.LeetCode.Graphs.NumberOfIslands;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') { // every time we come across a 1 , we call BFS that converts all the adjacent 1 values to 0,
                    // until it finds a non-adjacent 1, which is essentially another island
                    count+=1; // increment count everytime you see a 1
                    callBFS(grid, i, j);
                }
            }
        }
        return count;
    }

    private void callBFS(char[][]grid, int i, int j){ // checks the values up down left and right form the found indices and converts them to 0
        if (i < 0 || i > grid.length || j< 0 || j> grid[i].length || grid[i][j] == 0) return; // return when boundaries are overstepped or value is 0
        grid[i][j] = 0;
        callBFS(grid,i-1,j); // up
        callBFS(grid,i+1,j); // down
        callBFS(grid,i,j-1); // left
        callBFS(grid,i,j+1); // right
    }
}
