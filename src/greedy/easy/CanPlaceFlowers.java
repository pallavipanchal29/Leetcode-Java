package greedy.easy;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if ((n > 0 && flowerbed[i] == 0) && ((i == 0 || flowerbed[i - 1] != 1) && (i == flowerbed.length - 1 || flowerbed[i + 1] != 1))) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n == 0;
    }
}
