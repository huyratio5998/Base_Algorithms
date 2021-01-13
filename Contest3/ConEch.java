package T307;

import java.util.Scanner;

public class ConEch {
    static int n;
    static long[] F;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        F = new long[101];
        F[1] = 1;
        F[2] = 2;
        F[3] = 4;
        for (int i = 4; i <= 100; i++) {
            F[i] = F[i - 1] + F[i - 2] + F[i - 3];
        }
        while (test-- > 0) {
            n = in.nextInt();
            System.out.println(F[n]);
        }
    }
}
