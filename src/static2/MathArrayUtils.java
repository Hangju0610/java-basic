package static2;

public class MathArrayUtils {

    private MathArrayUtils() {

    }
    public static int sum(int[] values) {
        int sum = 0;
        for (int value:values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        int sum = sum(values);
        return (double) sum / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value: values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value: values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
