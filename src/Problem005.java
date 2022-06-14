public class Problem005 {
    /*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */
    public static void main(String[] args) {
        long number = 20;
        while(!isDividableByAll(20, number)) {
            System.out.println(number);
            number += 20;
        }
        System.out.println("\nThe smallest number is: " + number);

    }
    public static boolean isDividableByAll(long maxDivisor, long input) {
        boolean output = true;
        for(long i = 2; i <= maxDivisor; i++) {
            if (input % i != 0) {
                output = false;
            }
        }
        return output;
    }
}
