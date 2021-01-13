package T310;

import java.util.Scanner;

public class XauDoiXungDaiNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test-- > 0) {
            String str = in.nextLine();
            int n = str.length();
            boolean[][] F = new boolean[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                F[i][i] = true;
            }
            for (int i = 1; i <= n - 1; i++) {
                F[i+1][i] = true;
            }
            int max = 1;
            for (int k = 1; k <= n-1; k++) {
                for (int i = 1; i <= n - k; i++) {
                    int j = i + k;
                    F[i][j] = F[i+1][j-1]&&str.charAt(i-1)==str.charAt(j-1);
                    if (F[i][j] && (max < k + 1)) {
                        max = k + 1;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
