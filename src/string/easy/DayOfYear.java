package string.easy;

import java.time.Year;

public class DayOfYear {
    public static void main(String[] args) {
        System.out.println(dayOfYear("2004-03-01"));
    }

    public static int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int prevDays = 0;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    prevDays = prevDays + 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    prevDays = prevDays + 30;
                    break;
                case 2:
                    if (Year.isLeap(year))
                        prevDays = prevDays + 29;
                    else
                        prevDays = prevDays + 28;
                    break;
            }
        }
        int ans = prevDays + Integer.parseInt(parts[2]);
        return ans;
    }

    static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true; //Divisible by 4 and not by 100, leap year
            }
            return (year % 400 == 0); //Divisible by 4 and by 100. Leap year if divisible by 400.
        }
        return false; //Not divisible by 4 - not a leap year.
    }
}
