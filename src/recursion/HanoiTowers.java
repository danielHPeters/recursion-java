/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class HanoiTowers {

    public void moveDisks(){
        System.out.println("Bitte Anzahl Platten angeben");
        Scanner sc = new Scanner(System.in);
        move(sc.nextInt(), 'A', 'B', 'C');
    }
    
    public void move(int n, char start, char middle, char end) {
        if (n == 1) {
            System.out.println("Platte 1 von " + start + " zu " + end);
        } else {
            move(n - 1, start, end, middle);  //Schritt 1
            System.out.println("Platte " + n + " von " + start + " zu " + end);
            move(n - 1, middle, start, end);  //Schritt 3
        }
    }
}
