package array.easy;

import java.util.Arrays;

public class AvgSalaryExculdingMinAndMax {
    public static void main(String[] args) {
        System.out.println(average(new int[]{48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000}));
    }

    public static double average(int[] salary) {
        double sum = 0;
        Arrays.sort(salary);
        for (int i = 1; i < salary.length - 1; i++) {
            sum = sum + salary[i];
        }
        double avg = sum / (salary.length - 2);
        return (double) Math.round(avg * 100000d) / 100000d;
    }
}
