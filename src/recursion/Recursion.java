package recursion;

/**
 * Recursion examples
 *
 * @author Daniel
 */
public class Recursion {

    /**
     * 
     */
    public static void testLoopRecursionCompare() {
        LoopAndRecursionComparison c = new LoopAndRecursionComparison();

        System.out.println("For loop in action.");
        c.loopNumbers(8, 78);
        System.out.println();

        System.out.println("Recursion in action");
        c.recursiveNumbers(8, 78);
        System.out.println();
    }

    /**
     * 
     */
    public static void testFileWalker() {
        FileWalker luke = new FileWalker();
        luke.walk("C://Users/d.peters/documents");
        System.out.println();
    }

    /**
     * 
     */
    public static void testBinarySearch() {
        BinarySearch search = new BinarySearch();
        search.guessNumber(100, 3, 9);
        System.out.println();
    }

    /**
     * 
     */
    public static void testHanoiTowers() {
        HanoiTowers towers = new HanoiTowers();
        towers.moveDisks();
        System.out.println();
    }

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testLoopRecursionCompare();
        testFileWalker();
        testBinarySearch();
        testHanoiTowers();

    }
}
