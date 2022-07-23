import java.lang.Math;

public class Problem016 {
    /**
     * <p>2<sup>15</sup> = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.</p>
     * <p>What is the sum of the digits of the number 2<sup>1000</sup>?</p>
     */

    // task variables
    final static int BASE  = 2;
    final static int EXPONENT = 1000;

    public static void main(String[] args) {
        // not solved yet
        TimeHelper time = new TimeHelper();
        solution1();
        time.printDuration();
    }

    private static void solution1() {
        double power = Math.pow(BASE, EXPONENT);
        System.out.println(BASE + "^" + EXPONENT + " = " + power);
        System.out.println("checksum = " + checksum(power));
    }

    private static int checksum(double number) {
        String numberStr = String.valueOf(number);
        int checksum = 0;
        int steps = 0;
        for(int i = 0; i < numberStr.length(); i++) {
            steps++;
            char A = numberStr.charAt(i);
            checksum += numberStr.charAt(i) - 48;
        }
        System.out.println("Number of steps: " + steps);
        return checksum;
    }
}