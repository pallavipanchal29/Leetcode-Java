package string.easy;

import java.time.LocalDate;
import java.time.Year;

public class CountDaysSpentTogether {
    public static void main(String[] args) {
        System.out.println(countDaysTogether("08-15", "08-18", "08-16", "08-19"));
    }

    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        LocalDate d1 = LocalDate.of(Year.now().getValue(), Integer.parseInt(arriveAlice.substring(0, 2)), Integer.parseInt(arriveAlice.substring(3, 5)));
        LocalDate d2 = LocalDate.of(Year.now().getValue(), Integer.parseInt(leaveAlice.substring(0, 2)), Integer.parseInt(leaveAlice.substring(3, 5)));
        LocalDate d3 = LocalDate.of(Year.now().getValue(), Integer.parseInt(arriveBob.substring(0, 2)), Integer.parseInt(arriveBob.substring(3, 5)));
        LocalDate d4 = LocalDate.of(Year.now().getValue(), Integer.parseInt(leaveBob.substring(0, 2)), Integer.parseInt(leaveBob.substring(3, 5)));
        long aa = d1.toEpochDay(); //Alice Arrive
        long al = d2.toEpochDay(); //Alice Left
        long ba = d3.toEpochDay(); //Bob Arrive
        long bl = d4.toEpochDay(); //Bob Left
        if (al < ba || bl < aa) return 0; //No intersection of days
        return (int) ((Math.min(al, bl) - Math.max(aa, ba)) + 1); //Intersection of days
    }
}
