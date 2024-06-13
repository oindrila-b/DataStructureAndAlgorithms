package main.java.LeetCode.Arrays.NumberOfMove;

import java.util.Arrays;

public class NumberOfMoves {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int min = 0;
        for(int i = 0; i < seats.length; i++){
            min += Math.abs(seats[i] - students[i]);
        }
        return min;
    }
}
