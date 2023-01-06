package string.easy;

public class StudentAttendanceRecordOne {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLL"));
    }

    public static boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A':
                    absent++;
                    if (late > 0)
                        late = 0;
                    if (absent >= 2) return false;
                    break;
                case 'L':
                    late++;
                    if (late == 3)
                        return false;
                    break;
                default:
                    if (late > 0)
                        late = 0;
            }
        }

        return late < 3 && absent < 2;
    }
}
