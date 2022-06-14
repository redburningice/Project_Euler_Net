public class Problem001 {
    /*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below 1000.
     */
    public static void main(String[] args) {
        int inputNumber = 1000;
        int resultSum = 0;
        for(int i = 1; i < inputNumber; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                resultSum += i;
                System.out.println(i);
            }

        }
        System.out.println("\nResult: " + resultSum);
    }
}
