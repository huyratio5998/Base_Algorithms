package T313;

import java.util.Scanner;

public class XemPhim {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int n = in.nextInt();
        int[] w = new int[n + 5];
        for (int i = 1; i <= n; i++) {
            w[i] = in.nextInt();
        }
        int[][] F = new int[n + 5][c + 5];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= c; j++) {
                if (j >= w[i]) {
                    F[i][j] = Math.max(F[i - 1][j], F[i - 1][j - w[i]] + w[i]);
                } else F[i][j] = F[i - 1][j];
            }
        }
        System.out.println(F[n][c]);
    }

}
