/***
 * Goal: Determine and print the sum of array "a"
 * Method 1: no loop
 * Method 2: for loop
 * Method 3: for each loop
 * Rating: MILD
 */

public class Mild1a {

    public int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        Mild1a practice = new Mild1a();
    }

    public Mild1a() {

        int sum = 0;

        int sum2 = 0;
        for (int x = 0; x < a.length; x++) {

            sum2 = sum2 + a[x];
            System.out.println(a[x]);
        }
        /***
         * Your code goes here
         */

        System.out.println("The sum is " + sum2);

    }

}