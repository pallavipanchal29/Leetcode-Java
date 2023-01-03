package greedy.easy;

import java.util.Arrays;

public class MinNumberMovesSeatEveryone {
    public static void main(String[] args) {
        System.out.println(minMovesToSeat(new int[]{3, 1, 5}, new int[]{2, 7, 4}));
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        int moves = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            moves = moves + Math.abs(students[i] - seats[i]);
        }
        return moves;
    }
}
