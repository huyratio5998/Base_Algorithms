

import java.util.Scanner;

public class TongLonNhatCuaDayConTang {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            int[] A = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                A[i] = in.nextInt();
            }
            int[] F = new int[n + 1];
            int result = A[1];
            for (int i = 1; i <= n; i++) {
                F[i] = A[i];
                for (int j = 0; j < i; j++) {
                    if (A[j] < A[i] && F[i]<(F[j]+A[i])) {
                        F[i] = F[j]+A[i];
                    }
                }
                result = Math.max(F[i], result);
            }
            System.out.println(result);
        }
    }

}
