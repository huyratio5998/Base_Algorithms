/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest3;

/**
 *
 * @author huyng
 */
import java.util.*;
public class DayConLapLaiDaiNhat {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            in.nextLine();
            String str = in.nextLine();
            Try(str, n);
        }

    }

    public static void Try(String str, int n) {
        int[][] C = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (str.charAt(i - 1) == str.charAt(j - 1) && j != i) {
                    C[i][j] = C[i - 1][j - 1] + 1;
                }
                else {
                    C[i][j] = Math.max(C[i - 1][j], C[i][j - 1]);
                }
            }
        }
        System.out.println(C[n][n]);
    }
}
