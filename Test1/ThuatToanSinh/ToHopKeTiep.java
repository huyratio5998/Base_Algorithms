/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test1.ThuatToanSinh;
import java.util.Scanner;
public class ToHopKeTiep {
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n, k;
            n = in.nextInt();
            k = in.nextInt();
            int[] arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = in.nextInt();
            }

            // solution
            int p = k - 1, q = 0;
            while (p >= 0 && arr[p] == n - q) {
                p--;
                q++;
            }
            if (p < 0) {
                System.out.println(k);
            } else {
                int[] mark = new int[n + 1];
                for (int i = 1; i <= n; i++) mark[i] = 0;
                for (int i = 0; i < k; i++) {
                    int number = arr[i];
                    mark[number] = 1;
                }
                arr[p]++;
                int count = 0;
                if (mark[arr[p]] == 0) count++;
                for (int i = p + 1; i < k; i++) {
                    int tmp = arr[p] + i - p;
                    if (mark[tmp] == 0) count++;
                    arr[i] = tmp;
                }
                System.out.println(count);
            }
        }
    }
}


