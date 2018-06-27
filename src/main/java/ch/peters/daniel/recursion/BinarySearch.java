package ch.peters.daniel.recursion;

/**
 * Binary search example.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class BinarySearch {
  /**
   * Recursively guesses a number.
   *
   * @param upperBorder Specified upper border
   * @param lowerBorder Specified lower border
   * @param number      The number to be guessed
   */
  public void guessNumber(int upperBorder, int lowerBorder, int number) {
    var guess = (upperBorder + lowerBorder) / 2;

    if (guess == number) {
      System.out.println("Found it! " + guess);
    } else {
      if (guess > number) {
        upperBorder = guess - 1;
      } else {
        lowerBorder = guess + 1;
      }

      System.out.println("Guess: " + guess);
      guessNumber(upperBorder, lowerBorder, number);
    }
  }
}
