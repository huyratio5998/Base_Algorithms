package Contest3;

import java.util.Scanner;

public class XauConChungDaiNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test-- > 0) {
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            int n = s1.length();
            int m = s2.length();
            int[][] F =new int[n + 5][m + 5];

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= m; j++) {
                    if (i == 0 || j == 0) {
                        F[i][j] = 0;
                    } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        F[i][j] = F[i - 1][j - 1] + 1;
                    }
                    else {
                        F[i][j] = Math.max(F[i - 1][j], F[i][j - 1]);
                    }
                }
            }
            System.out.println(F[n][m]);
        }
    }

}

