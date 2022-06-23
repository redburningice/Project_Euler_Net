import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Problem009 {
    /**
     *A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
     *
     * a² + b² = c²
     * For example, 3² + 4² = 9 + 16 = 25 = 5².
     *
     * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     * Find the product abc.
     */
    public static void main(String[] args) {
        // total time: 0,036 s
        TimeHelper time = new TimeHelper();

        for(int b = 1; b < 1000; b++) {
            for(int a = 1; a < b; a++) {
                int c = 1000 - b - a;
                if (pow(a, 2) + pow(b, 2) == pow(c, 2)) {
                    int product = a * b * c;
                    System.out.println("a: " + a + " b: " + b + " c: " + c + " product: " + product);
                }
            }
        }

        time.printDuration();
    }
}
