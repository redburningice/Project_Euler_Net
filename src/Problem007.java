import java.util.ArrayList;

public class Problem007 {
    /*
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    What is the 10 001st prime number?
     */
    public static void main(String[] args) {
        long currentNumber = 3;
        int maxCount = 6;

        final long FIRST_PRIME = 2;
        ArrayList<Long> uniquePrimes = new ArrayList<>();
        uniquePrimes.add(FIRST_PRIME);

        while(uniquePrimes.size() < 10_001) {
            boolean isPrime = true;
            for(Long prime : uniquePrimes) {
                if (currentNumber % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                uniquePrimes.add(currentNumber);
//                System.out.println(currentNumber);
            }
            currentNumber++;
        }
        System.out.println(uniquePrimes);
        System.out.println("10 001st prime number = " + uniquePrimes.get(10_000));
    }
}
