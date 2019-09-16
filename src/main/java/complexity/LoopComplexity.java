package main.java.complexity;

public class LoopComplexity {

    public static void main(String[] args) {

        int i, j, k;
        int n = 10;
        int count = 0;

        for (int l = 1; l <= n; l = l * 2) {
            count++;
        }

        System.out.println("Count : " + count);

        /*for (i = n/2  ; i <= n ; i++){
        //        executes (n/2) times
            for (j = 1; j + n/2 <= n; j++) {
            //        executes (n/2) times
                for (k = 1; k <= n; k = k*2) {
                //        executes (log n) times

                    System.out.println("=========");
                    System.out.println(k);
                    System.out.println("=========");
                    System.out.println(n);
                    System.out.println("=========");
                }

            }
        }*/

    }

}
