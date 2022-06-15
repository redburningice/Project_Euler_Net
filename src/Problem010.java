import java.util.ArrayList;

public class Problem010 {
    static final int border = 2_000_000;
    static final long FIRST_PRIME = 2;
    /**
     *The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
     *
     * Find the sum of all the primes below two million.
     */
    public static void main(String[] args) {
        ArrayList<Long> uniquePrimes = new ArrayList<>();
        uniquePrimes.add(FIRST_PRIME);
        long sum = FIRST_PRIME;
        for(long i = FIRST_PRIME + 1; i <= border; i++) {
            boolean isPrime = true;
            for(Long prime : uniquePrimes) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                uniquePrimes.add(i);
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(uniquePrimes.toString());
        System.out.println("Sum: " + sum);
    }
}
