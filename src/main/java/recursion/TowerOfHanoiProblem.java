package main.java.recursion;

import java.util.Scanner;

/**
 * The type Tower of hanoi problem.
 */
public class TowerOfHanoiProblem {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Disks : ");
        int numberOfDisks = sc.nextInt();
        TowerOfHanoiProblem obj = new TowerOfHanoiProblem();
        obj.towerOfHanoi(numberOfDisks, "Source(S)", "Destination(D)", "Auxiliary(A)");
    }

    /**
     * Tower of hanoi.
     *
     * @param numberOfDisks the number of disks
     * @param fromTower     the from tower
     * @param toTower       the to tower
     * @param auxiTower     the auxi tower
     */
    public void towerOfHanoi(int numberOfDisks, String fromTower, String toTower, String auxiTower) {

        if (numberOfDisks == 1) {
            System.out.println("Move disk 1 from Tower " + fromTower + " to Tower " + toTower);
            return;
        }
        towerOfHanoi(numberOfDisks - 1, fromTower, auxiTower, toTower);
        System.out.println("Move disk " + numberOfDisks + " from Tower " + fromTower + " to Tower " + toTower);
        towerOfHanoi(numberOfDisks - 1, auxiTower, toTower, fromTower);
    }
}


