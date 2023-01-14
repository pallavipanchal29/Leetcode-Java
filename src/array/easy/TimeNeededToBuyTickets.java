package array.easy;

public class TimeNeededToBuyTickets {
    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[]{5, 1, 1, 1}, 0));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        while (true) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] == 0) continue;
                tickets[i] = tickets[i] - 1;
                time++;
                if (i == k && tickets[i] == 0)
                    return time;
            }
        }
    }
}
