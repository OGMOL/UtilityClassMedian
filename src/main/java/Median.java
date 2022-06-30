import java.util.Arrays;

public class Median {

    private Median() {
    }

    public static double median(double[] arr) {
        Arrays.sort(arr);
        double result;
        if (arr.length % 2 == 0) {
            result = ((arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2);
        } else {
            result = arr[arr.length / 2];
        }
        return result;
    }

    public static float median(int[] arr) {
        Arrays.sort(arr);
        float result;
        if (arr.length % 2 == 0) {
            result = ((arr[arr.length / 2] + (float) arr[arr.length / 2 - 1]) / 2);
        } else {
            result = arr[arr.length / 2];
        }
        return result;
    }
}
