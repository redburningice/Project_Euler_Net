import java.util.ArrayList;

public class Problem003 {
    /*
    The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600_851_475_143 ?
     */
    public static void main(String[] args) {
        // total time: 0,000 s
        TimeHelper time = new TimeHelper();
        long input = 600_851_475_143L;
        long buffer = input;

        //ArrayList<Long> uniquePrimes = returnUniquePrimes(input);
        ArrayList<Long> actualPrimes = new ArrayList<>();
        //System.out.println(uniquePrimes);

        // divide the number
        do {
            for(long i = 2; i <= buffer; i++) {
                if (buffer % i == 0) {
                    actualPrimes.add(i);
                    buffer /= i;
                    break;
                }
            }
        } while(buffer != 1);

        System.out.println(actualPrimes);
        time.printDuration();
    }

    // This was not a good approach, since there are quite a lot of prime numbers up to the defined input number.
    public static ArrayList<Long> returnUniquePrimes(long input) {
        final long FIRST_PRIME = 2;
        ArrayList<Long>  uniquePrimes = new ArrayList<>();
        uniquePrimes.add(FIRST_PRIME);

        //calculate all possible prime numbers for the input number
        for(long i = FIRST_PRIME + 1; i <= input; i++) {
            boolean isPrime = true;
            for(Long prime : uniquePrimes) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                uniquePrimes.add(i);
                System.out.println(i);
            }
        }
        return uniquePrimes;
    }
}
