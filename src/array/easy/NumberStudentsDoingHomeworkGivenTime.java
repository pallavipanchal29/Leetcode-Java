package array.easy;

public class NumberStudentsDoingHomeworkGivenTime {
    public static void main(String[] args) {
        int[] start = {1, 2, 3};
        int[] end = {3, 2, 7};
        System.out.println(busyStudent(start, end, 4));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime)
                count++;
        }
        return count;
    }
}
