package main.java.LeetCode.TwoPointer.ContainerWithMostWater;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max_area = 0;
        int p1 = 0;
        int p2 = height.length -1;
        while (p1 < p2) {
            if (height[p1] < height[p2]) {
                max_area = Math.max(max_area, (height[p1] * (p2 - p1)));
                p1++;
            } else {
                max_area = Math.max(max_area, (height[p2] * (p2 - p1)));
                p2--;
            }
        }
        return max_area;
    }
}
