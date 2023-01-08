package greedy.easy;

public class LemonadeChange {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5, 5, 5, 5, 10, 5, 10, 10, 10, 20}));
    }

    public static boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) fives++;
            else {
                if (bills[i] == 10) {
                    if (fives == 0) return false;
                    else {
                        tens++;
                        fives--;
                    }
                } else if (bills[i] == 20) {

                    if (tens == 0 && fives >= 3)
                        fives = fives - 3;
                    else if (tens >= 1 && fives >= 1) {
                        tens--;
                        fives--;
                    } else
                        return false;
                }
            }
        }
        return true;
    }
}
