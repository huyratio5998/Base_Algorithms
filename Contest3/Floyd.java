package T329;

import java.util.Scanner;


public class Floyd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[][] d = new long[n + 5][n + 5];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                d[i][j] = 10000000L;
            }
        }
        for (int i = 1; i <= m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            int c = in.nextInt();
            d[u][v] = d[v][u] = c;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }
        int q = in.nextInt();
        while (q-- > 0) {
            int u = in.nextInt();
            int v = in.nextInt();
            if(u!=v) System.out.println(d[u][v]);
            else System.out.println(0);
        }
    }
}
