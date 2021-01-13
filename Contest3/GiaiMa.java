package T316;

import java.util.Scanner;

public class GiaiMa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test-- > 0) {
            String m = in.nextLine();
            if (m.charAt(0) == '0') {
                System.out.println(0);
                continue;
            }
            int n = m.length();
            int[] F = new int[n + 5];
            F[0] = 1;
            F[1] = 1;
            for (int i = 2; i <= n; i++) {
                F[i] = 0;
                if (m.charAt(i - 1) > '0') {
                    F[i] = F[i - 1];
                }
                if (m.charAt(i - 2) == '1' || m.charAt(i - 2) == '2' && m.charAt(i - 1) < '7') {
                    F[i]+=F[i-2];
                }
            }
            System.out.println(F[n]);
        }
    }

}
