package string.easy;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
    }

    public static boolean judgeCircle(String moves) {
        int hor = 0;
        int ver = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L':
                    hor--;
                    break;
                case 'R':
                    hor++;
                    break;
                case 'U':
                    ver++;
                    break;
                case 'D':
                    ver--;
                    break;

            }
        }
        return (hor == 0 && ver == 0);
    }
}
