package T309;

import java.util.Scanner;

public class BacThang {
    static long mod = 1000000007;
    static long[] F;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            F = new long[n+1];
            F[0] = 1;
            F[1] = 1;
            for (int i = 2; i <= n; i++) {
                F[i] = 0;
                for (int j = 1; j <= k && j <= i; j++) {
                    F[i] = (F[i]+F[i-j])%mod;
                }
            }
            System.out.println(F[n]);
        }

    }

}
