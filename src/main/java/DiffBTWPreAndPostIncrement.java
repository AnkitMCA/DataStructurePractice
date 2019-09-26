package main.java;

public class DiffBTWPreAndPostIncrement {

    public static void main(String[] args) {

        int i, j;

        i = 1;
        j = ++i;

        System.out.println(" i : " + i);
        System.out.println(" j : " + j);

        System.out.println("--------");

        i = 1;
        j = i++;

        System.out.println(" i : " + i);
        System.out.println(" j : " + j);
    }
}
