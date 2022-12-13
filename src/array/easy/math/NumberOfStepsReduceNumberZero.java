package array.easy.math;

public class NumberOfStepsReduceNumberZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0)
                num = num / 2;
            else
                num = num - 1;
            steps++;
        }
        return steps;
    }
}
