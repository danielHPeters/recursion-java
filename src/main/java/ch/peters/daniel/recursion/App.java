package ch.peters.daniel.recursion;

/**
 * Recursion examples.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class App {
  private static void testLoopRecursionCompare() {
    var c = new LoopAndRecursionComparison();

    System.out.println("For loop in action.");
    c.loopNumbers(8, 78);
    System.out.println();

    System.out.println("Recursion in action");
    c.recursiveNumbers(8, 78);
    System.out.println();
  }

  private static void testFileWalker() {
    var luke = new FileWalker();
    luke.walk("C://Users/d.peters/documents");
    System.out.println();
  }

  private static void testBinarySearch() {
    var search = new BinarySearch();
    search.guessNumber(100, 3, 9);
    System.out.println();
  }

  private static void testHanoiTowers() {
    var towers = new HanoiTowers();
    towers.moveDisks();
    System.out.println();
  }

  /**
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    testLoopRecursionCompare();
    testFileWalker();
    testBinarySearch();
    testHanoiTowers();
  }
}
