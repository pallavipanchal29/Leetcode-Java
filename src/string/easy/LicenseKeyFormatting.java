package string.easy;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        s = s.toUpperCase().replaceAll("-", "");
        int i = s.length() - 1;
        while (i >= 0) {
            int t = k;
            while (i >= 0 && t > 0) {
                sb.append(s.charAt(i));
                t--;
                i--;
            }
            if (i >= 0)
                sb.append("-");
        }
        return sb.reverse().toString();
    }
}
