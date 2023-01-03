package string.easy;

public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        System.out.println(minDeletionSize(new String[]{"zyx", "wvu", "tsr"}));
    }

    public static int minDeletionSize(String[] strs) {
        int count = 0;
        int ind = 0;

        while (ind < strs[0].length()) {
            int i = 1;
            while (i < strs.length) {

                if (strs[i].charAt(ind) < strs[i - 1].charAt(ind)) {
                    count++;
                    break;
                }
                i++;
            }
            ind++;
        }
        return count;
    }
}
