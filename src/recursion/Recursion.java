package recursion;

/**
 *
 * @author Daniel
 */
public class Recursion {
    public static void main(String[] args) {
        printRecursive(8,78);
        System.out.println();
        /*FileWalker luke = new FileWalker();
        luke.walk("C://");*/
        //BinarySearch search = new BinarySearch();
        //search.guessNumber(100, 3, 9);
        HanoiTowers towers = new HanoiTowers();
        towers.moveDisks();
        
    }
    
    public static void printSeries(int n1, int n2){
        for (int i = n1; i < n2; i++){
            System.out.println(i + ",");
        }
        System.out.println(n2);
    }
    
    public static void printRecursive(int n1, int n2){
        System.out.print(n1);
        if (n1 < n2){
            System.out.println(",");
            printRecursive(n1 + 1, n2);
        }
    }
}
