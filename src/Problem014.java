public class Problem014 {
    /**
     * The following iterative sequence is defined for the set of positive integers:
     *
     * n → n/2 (n is even)
     * n → 3n + 1 (n is odd)
     *
     * Using the rule above and starting with 13, we generate the following sequence:
     *
     * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
     * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
     *
     * Which starting number, under one million, produces the longest chain?
     *
     * NOTE: Once the chain starts the terms are allowed to go above one million.
     */

    // task variables
    final static int MAX_START_VALUE = 1_000_000;
    final static int MIN_START_VALUE = 1;

    public static void main(String[] args) {
        // total time: 8.162 s
        TimeHelper time = new TimeHelper();
        solution1();
        time.printDuration();
    }

    private static void solution1() {
        int longestChainTerms = 0;
        int longestChainStartValue = 0;
        for (int i = MIN_START_VALUE; i <= MAX_START_VALUE; i++) {
            double number = i;
            int counter = 1;
            System.out.print(number + " -> ");
            while (number != 1) {
                counter++;
                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number = 3 * number + 1;
                }
//                System.out.println(counter + " -> " + number);
//                System.out.print(number + " -> ");
            }
            if (counter > longestChainTerms) {
                longestChainTerms = counter;
                longestChainStartValue = i;
            }
            System.out.print("            " + counter);
            System.out.println();
        }
        System.out.println("Longest Chain: " + longestChainTerms + " - with the starting number: " + longestChainStartValue);

    }
}
