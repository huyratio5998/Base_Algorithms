/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;
import java.util.Scanner;

public class NQuanHau1 {
    static int count;
    static int n;
    static boolean[] row;
    static boolean[] cheo2;
    static boolean[] cheo1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            count = 0;
            n = in.nextInt();
            row = new boolean[n];
            cheo2 = new boolean[n * 2];
            cheo1 = new boolean[n * 2];
            Try(0);
            System.out.println(count);
        }
    }
    static void Try(int k) {
        if (k == n) {
            count++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!row[i] && !cheo2[i - k + n - 1] && !cheo1[i + k]) {
                row[i] = true;
                cheo2[i - k + n - 1] = true;
                cheo1[i +k] = true;
                Try(k + 1);
                row[i] = false;
                cheo2[i - k + n - 1] = false;
                cheo1[i +k] = false;
            }
        }
    }

}
