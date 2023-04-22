import java.util.ArrayList;

public class Problem012 {
    /**
     * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
     *
     * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
     *
     * Let us list the factors of the first seven triangle numbers:
     *
     *  1: 1
     *  3: 1,3
     *  6: 1,2,3,6
     * 10: 1,2,5,10
     * 15: 1,3,5,15
     * 21: 1,3,7,21
     * 28: 1,2,4,7,14,28
     * We can see that 28 is the first triangle number to have over five divisors.
     *
     * What is the value of the first triangle number to have over five hundred divisors?
     * @param args
     */
    // inputs
    static final int MAX_FACTORS = 200;

    public static void main(String[] args) {
        // total time: 2229,935 s ~37 min //todo:fabian try to make the program faster
        // benchmark with 200 MAX_FACTORS: 9,941 s
        TimeHelper time = new TimeHelper();

        int factors = 0;
        int highestNumberOfFactors = 0;
        int number = 1;
        int sum = 0;
        while (getFactorsCount(sum) < MAX_FACTORS) {
            sum = number + sum;
            number++;
            factors++;
            if (getFactorsCount(sum) > highestNumberOfFactors) {
                highestNumberOfFactors = getFactorsCount(sum);
            }
//            System.out.println(String.format("%,d", sum) + ": " + "(" + getFactors(sum).size() + ") " + "(" + highestNumberOfFactors + ") " + getFactors(sum));
            System.out.print(highestNumberOfFactors+"/" + MAX_FACTORS + "\r");
        }

        time.printDuration();
    }

    private static ArrayList<Integer> getFactors(int sum) {
        ArrayList<Integer> output = new ArrayList<>();
        for(int i = 1; i <= sum / 2; i++) {
            if (sum % i == 0) {
                output.add(i);
            }
        }
        output.add(sum);
        return output;
    }

    private static int getFactorsCount(int sum) {
        int output = 0;
        for(int i = 1; i <= sum / 2; i++) {
            if (sum % i == 0) {
                output++;
            }
        }
        return output;
    }
}