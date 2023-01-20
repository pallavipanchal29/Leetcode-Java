package array.easy.math;

public class PartitionArrayEqualParrtsEqualSum {
    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}));
    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for (int val : arr) {
            total += val;
        }

        if (total % 3 != 0)
            return false;

        int equalSum = total / 3;
        int totalParts = 0;
        total = 0;
        for (int index = 0; index < arr.length; index++) {
            total += arr[index];
            if (total == equalSum && totalParts < 2 && index != arr.length - 1) {
                totalParts++;
                total = 0;
            }
        }
        if (total == equalSum)
            totalParts++;
        return totalParts == 3;
    }
}
