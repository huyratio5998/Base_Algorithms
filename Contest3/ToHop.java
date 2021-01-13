package T308;

import java.util.Scanner;

public class ToHop {

    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(comb(n,k));
        }
    }

    public static long comb(int n, int k) {
        long[][] C = new long[n + 1][n + 1];
        C[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            C[i][0] =1;
            C[i][i] = 1;
            for (int j = 1; j < i; j++) {
                C[i][j] = (C[i - 1][j - 1] + C[i - 1][j])%mod;
            }
        }
        return C[n][k];
    }

}
