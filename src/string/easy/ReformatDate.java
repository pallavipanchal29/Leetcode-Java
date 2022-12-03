package string.easy;

public class ReformatDate {
    public static void main(String[] args) {
        System.out.println(reformatDate("20th Oct 2052"));
    }

    public static String reformatDate(String date) {
        StringBuilder sb = new StringBuilder();
        String[] parts = date.split(" ");
        sb.append(parts[2] + "-");

        String mon = parts[1];
        String m = "";
        switch (mon) {
            case "Jan":
                m = "01";
                break;
            case "Feb":
                m = "02";
                break;
            case "Mar":
                m = "03";
                break;
            case "Apr":
                m = "04";
                break;
            case "May":
                m = "05";
                break;
            case "Jun":
                m = "06";
                break;
            case "Jul":
                m = "07";
                break;
            case "Aug":
                m = "08";
                break;
            case "Sep":
                m = "09";
                break;
            case "Oct":
                m = "10";
                break;
            case "Nov":
                m = "11";
                break;
            case "Dec":
                m = "12";
                break;
        }
        sb.append(m + "-");

        String day = "";
        if (parts[0].length() == 4)
            day = parts[0].substring(0, 2);
        else
            day = "0" + parts[0].charAt(0);
        sb.append(day);
        return sb.toString();
    }
}
