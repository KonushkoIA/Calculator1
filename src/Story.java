import java.util.Arrays;

public class Story {
    public static double[] story = new double[5];

    @Override
    public String toString() {
        return "История операций: " + Arrays.toString(story);
    }
}
