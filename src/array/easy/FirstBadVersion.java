package array.easy;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(1));
    }

    public static int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                if (mid == 0 || isBadVersion(mid - 1) == false) return mid;
                else
                    high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    static boolean isBadVersion(int version) {
        int bad = 1;
        return version == bad;
    }
}
