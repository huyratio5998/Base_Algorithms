package T314;

import java.util.Scanner;

public class CaiTui {
    static int v;
    static int n;
    static int[] a;
    static int[] c;
    static long[][] maxV;
    public static long Try() {
        long kq = 0;
        for (int i = 1; i <= n; i++) {
            maxV[i][a[i]] = Math.max(c[i],maxV[i-1][a[i]]);
            for (int L = 1; L <= v; L++) {
                maxV[i][L] = Math.max(maxV[i-1][L],maxV[i][L]);
                if (maxV[i - 1][L] != 0 && L + a[i] <= v) {
                    maxV[i][L + a[i]] = Math.max(maxV[i][L + a[i]], maxV[i - 1][L] + c[i]);
                }
                kq = Math.max(kq,maxV[i][L]);
            }
        }
        return maxV[n][v];

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        while (test-- > 0) {
            n = in.nextInt();
            v = in.nextInt();

            maxV = new long[1003][1003];
            a = new int[1003];
            c = new int[1003];

            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
            }

            for (int i = 1; i <= n; i++) {
                c[i] = in.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= v; j++) {
                    maxV[i][j] = 0;
                }
            }

            System.out.println(Try());

        }
    }
}
