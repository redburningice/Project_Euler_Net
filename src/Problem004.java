import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Problem004 {
    /*
    A palindromic number reads the same both ways.
    The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    Find the largest palindrome made from the product of two 3-digit numbers.
     */
    public static void main(String[] args) {
        // total time: 0,287 s
        TimeHelper time = new TimeHelper();
        ArrayList<Integer> results = new ArrayList<>();

        for(int a = 1; a <= 999; a++) {
            for (int b = 1; b <= 999; b++) {
                if (isPalindrome(a*b)) {
                    if (!results.contains(a*b)) {
                        results.add(a*b);
                    }
                    System.out.println(a*b + ": " + a + " * " + b);
                }
            }
        }
        results.sort((o1, o2) -> Integer.compare(o1, o2));
        System.out.println(results);
        System.out.println("max: " + results.get(results.size()-1));
        time.printDuration();
    }

    public static boolean isPalindrome(int input) {
        if (input < 10) {
            return false;
        }
        String inputAsString = Integer.toString(input);
        String reversedInput = "";
        for(int i = inputAsString.length() - 1; i >= 0; i--) {
            char c = inputAsString.charAt(i);
            reversedInput += c;
        }
        return reversedInput.equals(inputAsString);
    }
}
