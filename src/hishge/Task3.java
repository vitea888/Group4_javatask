package hishge;

public class Task3 {
    /*
Numbers – Swap Numbers
Swap two variables' values without using a third variable.

*/
    public static void main(String[] args) {
        int A = 5;
        int B = 6;
        A = A + B; // A = 11
        B = A - B; // B = 5
        A = A - B; // A = 6

        System.out.println(A);
        System.out.println(B);
    }
}
