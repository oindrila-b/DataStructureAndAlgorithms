package main.java.LeetCode.Arrays.NextGreaterElement1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NextGreaterElement element = new NextGreaterElement();
        System.out.println(Arrays.toString(element.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
        System.out.println(Arrays.toString(element.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(element.nextGreaterElement(new int[]{1,3,5,2,4}, new int[]{6,5,4,3,2,1,7})));
        System.out.println(Arrays.toString(element.nextGreaterElement(new int[]{1,3,5}, new int[]{3,2,5,0,8,1})));
    }
}
