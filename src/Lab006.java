/**
 *
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */


// Sorry for getting this stuff done late, I've had a lot of make up work to do and other responsibilities this week and CIS-12 accitdentally slipped to the back of my mind. I don't expect forgiveness, I just thought it prudent to explain my tardiness in submission.

import java.util.Scanner;

public class Lab006 {

    private int n;

    private int m;


    /**
     *Constructs a new Lab006 object that has the instance variables n and m.
     *
     * @param n an integer number.
     * @param m a second integer number.
     */
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
    }

    /**
     * Returns true or false depending on whether n is evenly divisible by m in a Lab006 object.
     *
     * @return the boolean resulting value of the condition.
     */
    public boolean isDivisible() {
        return this.n % this.m == 0;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int n = in.nextInt();
        in.nextLine();
        System.out.println();

        System.out.print("Enter the second integer: ");
        int m = in.nextInt();
        in.nextLine();
        System.out.println();

        Lab006 lab = new Lab006(n,m);

        if (lab.isDivisible()) {
            System.out.printf("%d is divisible by %d.\n", lab.n, lab.m);
        } else {
            System.out.printf("%d is not divisible by %d.\n", lab.n, lab.m);
        }


    }
}
