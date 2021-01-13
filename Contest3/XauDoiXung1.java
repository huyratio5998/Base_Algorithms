package T311;

import java.util.Scanner;

public class XauDoiXung1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test-- > 0) {
            String str = in.nextLine();
            int n = str.length();
            int[][] F = new int[n + 2][n + 2];
            for (int i = 1; i <= n; i++) {
                F[i][i] = 0;
            }
            for (int k = 1; k <= n-1; k++) {
                for (int i = 1; i <= n-k; i++) {
                    int j = i+k;
                    if (str.charAt(i - 1) == str.charAt(j - 1)) {
                        F[i][j] = F[i + 1][j - 1];
                    } else {
                        F[i][j] = Math.min(F[i][j - 1], F[i + 1][j]) + 1;
                    }
                }
            }
            System.out.println(F[1][n]);
        }

    }
}
