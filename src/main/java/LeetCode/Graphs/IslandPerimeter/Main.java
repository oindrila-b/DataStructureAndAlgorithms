package main.java.LeetCode.Graphs.IslandPerimeter;

public class Main {
    public static void main(String[] args) {
        IslandPerimeter islandPerimeter = new IslandPerimeter();
        int[][] grid = new int[][]{{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
        int[][] grid2 = new int[][]{{1}};
        int[][] grid3 = new int[][]{{1,0}};
        System.out.println( islandPerimeter.islandPerimeter(grid));
        System.out.println( islandPerimeter.islandPerimeter(grid2));
        System.out.println( islandPerimeter.islandPerimeter(grid3));
    }
}
