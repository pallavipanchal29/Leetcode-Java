package string.easy.datetime;

public class MinOperationsConvertTime {
    public static void main(String[] args) {
        System.out.println(convertTime("02:30", "04:35"));
    }

    public static int convertTime(String current, String correct) {
        int curHour = (current.charAt(0) - '0') * 10 + (current.charAt(1) - '0');
        int curMin = (current.charAt(3) - '0') * 10 + (current.charAt(4) - '0');
        int corHour = (correct.charAt(0) - '0') * 10 + (correct.charAt(1) - '0');
        int corMin = (correct.charAt(3) - '0') * 10 + (correct.charAt(4) - '0');
        int diff = (corHour * 60 + corMin) - (curHour * 60 + curMin);
        int sixty = diff / 60;
        diff -= sixty * 60;
        int fifteen = diff / 15;
        diff -= fifteen * 15;
        int five = diff / 5;
        diff -= five * 5;
        return sixty + fifteen + five + diff;
    }
}
