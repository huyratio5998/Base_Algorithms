package T312;

import java.util.Scanner;

public class XauDoiXung2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test-- > 0) {
            String str = in.nextLine();
            int n = str.length();
            int[][] F =new int[n + 2][n + 2];
            for (int i = 1; i <= n; i++) {
                F[i][i] = 1;
            }
            for (int k = 1; k <= n - 1; k++) {
                for (int i = 1; i <= n - k; i++) {
                    int j = i + k;
                    if (str.charAt(i-1) == str.charAt(j-1)) {
                        F[i][j] = F[i + 1][j - 1] + 2;
                    }
                    else {
                        F[i][j] = Math.max(F[i][j - 1], F[i + 1][j]);
                    }
                }
            }
            System.out.println(n-F[1][n]);
        }
    }
}
