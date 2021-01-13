package T306;

import java.util.Scanner;

public class SoBuocItNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            int[] A = new int[n + 1];
            int[] E = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                A[i] = in.nextInt();
            }
            int res = 0;
            for (int i = 1; i <= n; i++) {
                E[i] = 1;
                for (int j = 1; j < i; j++) {
                    if (A[i] >= A[j]) {
                        E[i] = Math.max(E[i], E[j] + 1);
                    }
                }
                res = Math.max(res,E[i]);
            }
            System.out.println(n-res);
        }
    }
}
