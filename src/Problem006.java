import static java.lang.Math.*;

public class Problem006 {
    /*
    The sum of the squares of the first ten natural numbers is,
        1^2 + 2^2 + ... + 10^2 = 385
    The square of the sum of the first ten natural numbers is,
        (1 + 2 + ... + 10)^2 = 55^2 = 3025
    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     */
    public static void main(String[] args) {
        // total time: 0,027 s
        TimeHelper time = new TimeHelper();
        int min = 0;
        int max = 100;
        int squaresSum = 0;
        int sumSquared = 0;
        int difference = 0;
        for(int i = min; i <= max; i++) {
            squaresSum += pow(i, 2);
            sumSquared += i;
        }
        sumSquared = (int) pow(sumSquared, 2);
        difference = abs(sumSquared - squaresSum);
        System.out.println("Sum of squares: " + squaresSum +
                        "\nSquare of sum: " + (int) sqrt(sumSquared) + "² = " + sumSquared +
                        "\nDifference: " + difference);

        time.printDuration();
    }
}
