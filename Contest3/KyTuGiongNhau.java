package T315;

import java.util.Scanner;

public class KyTuGiongNhau {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            int X = in.nextInt();   
            int Y = in.nextInt();   
            int Z = in.nextInt();   
            int[] F = new int[n + 5];
            F[0] = 0;
            F[1] = X;
            for (int i = 2; i <= n; i++) {
                if (i % 2 == 1) {
                    F[i] = Math.min(F[i - 1] + X, F[(i + 2) / 2] + Z + Y);
                }
                else {
                    F[i] = Math.min(F[i - 1] + X, F[i / 2] + Z);
                }
            }
            System.out.println(F[n]);
        }
    }

}
