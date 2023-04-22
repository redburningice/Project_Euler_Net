import java.text.DecimalFormat;

public class TimeHelper {

    /*
    // Time taken [s]:
    float startTime = System.nanoTime();

    float endTime = System.nanoTime();
    float duration = (endTime - startTime) / 1_000_000_000;
    System.out.println("// Time taken [s]: " + String.format("%.3g%n", duration));
    */

    float startTime;
    float endTime;

    private float getStartTime() {
        return startTime;
    }

    public TimeHelper() {
        setStartTime();
    }

    private void setStartTime() {
        float startTime = System.nanoTime();
        this.startTime = startTime;
    }

    private float getEndTime() {
        return endTime;
    }

    private void setEndTime() {
        float endTime = System.nanoTime();
        this.endTime = endTime;
    }

    private float getDuration() {
        return (getEndTime() - getStartTime()) / 1_000_000_000;
    }

    public void printDuration() {
        setEndTime();
        DecimalFormat df = new DecimalFormat("#0.000");
        System.out.println(String.format("\n\n~~~~~~~~~~\n// total time: %s s", df.format(getDuration())));
    }
}
