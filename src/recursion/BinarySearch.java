package recursion;

/**
 *
 * @author Daniel
 */
public class BinarySearch {

    public void guessNumber(int upperborder, int lowerborder, int number) {

        int guess = (upperborder + lowerborder) / 2;

        if (guess == number) {
            System.out.println("Found it! " + guess);
        } else {

            if (guess > number) {
                upperborder = guess - 1;
            } else if (guess < number) {
                lowerborder = guess + 1;
            }

            System.out.println("Guess: " + guess);
            guessNumber(upperborder, lowerborder, number);
        }
    }
}
