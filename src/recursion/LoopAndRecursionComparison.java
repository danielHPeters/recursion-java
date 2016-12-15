package recursion;

/**
 * A comparison of loops and recursion
 *
 * @author d.peters
 */
public class LoopAndRecursionComparison {

    /**
     * Print numbers from n1 to n2 using a loop
     *
     * @param n1 first number
     * @param n2 last number
     */
    public void loopNumbers(int n1, int n2) {

        for (int i = n1; i < n2; i++) {
            System.out.println(i + ",");
        }

        System.out.println(n2);
    }

    /**
     * Print numbers from n1 to n2 using recursion
     *
     * @param n1 first number
     * @param n2 last number
     */
    public void recursiveNumbers(int n1, int n2) {

        System.out.print(n1);

        if (n1 < n2) {
            System.out.println(",");
            recursiveNumbers(n1 + 1, n2);
        }
    }
}
