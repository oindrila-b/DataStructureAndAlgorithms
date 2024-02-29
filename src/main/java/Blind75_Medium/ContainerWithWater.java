package main.java.Blind75_Medium;

public class ContainerWithWater {
    public int maxArea(int[] height) {
        int max_water = 0;
        int p1 = 0, p2 = height.length -1; // we essentially wanna close in with the two pointers, and each time we wanna calculate the area enclosed
        while (p1 < p2) {
            if (height[p1] > height[p2]) {
                max_water = Math.max(max_water, (height[p2]) * (p2 - p1));
                p2--;
            }else {
                max_water = Math.max(max_water, (height[p1]) * (p2 - p1));
                p1++;
            }
        }
        return max_water;
    }
}
