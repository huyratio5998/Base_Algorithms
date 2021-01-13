package T317;

import java.util.Scanner;

public class TongBinhPhuong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            long[] F = new long[n + 5];
            for (int i = 1; i <= n; i++) {
                F[i] = i;
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= Math.sqrt(i); j++) {
                    F[i] = Math.min(F[i], F[i - j * j] + 1);
                }
            }
            System.out.println(F[n]);
        }
    }

}
