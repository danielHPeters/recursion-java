package ch.peters.daniel.recursion;

import java.util.Scanner;

/**
 * Hanoi towers example.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class HanoiTowers {
  public void moveDisks() {
    System.out.println("Bitte Anzahl Platten angeben");
    var sc = new Scanner(System.in);
    move(sc.nextInt(), 'A', 'B', 'C');
  }

  public void move(int plateCount, char start, char middle, char end) {
    if (plateCount == 1) {
      System.out.println("Platte 1 von " + start + " zu " + end);
    } else {
      move(plateCount - 1, start, end, middle);  //Schritt 1
      System.out.println("Platte " + plateCount + " von " + start + " zu " + end);
      move(plateCount - 1, middle, start, end);  //Schritt 3
    }
  }
}
