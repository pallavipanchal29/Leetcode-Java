package array.easy;

public class DistanceBetweenBusStops {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(distanceBetweenBusStops(arr, 0, 1));
    }

    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int frontSum = 0;
        int backSum = 0;
        for (int i = start; i != destination; i = (i + 1) % distance.length)
            frontSum += distance[i];
        for (int i = destination; i != start; i = (i + 1) % distance.length)
            backSum += distance[i];
        return Math.min(frontSum, backSum);
    }
}
