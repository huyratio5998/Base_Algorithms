package T304;

import java.util.Scanner;

public class DayConTangDaiNhat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n+1];
        for (int i = 1; i <= n; i++) {
            A[i] = in.nextInt();
        }
        int result = 1;
        int[] f = new int[n+1];
        for (int i = 1; i <= n; i++) {
            f[i]=0;
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
            result = Math.max(result, f[i]);
        }
        System.out.println(result);
    }
}
