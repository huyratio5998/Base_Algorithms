/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//wrong
package Test1;
import java.util.*;
public class SapXepCongViec {
    public static class Cv{
        public int start;
        public int end;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            Cv[] cv = new Cv[n];
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                cv[i] = new Cv();
                cv[i].start = in.nextInt();
                cv[i].end = in.nextInt();
            }
            
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (b[i] > b[j]) {
                        // đổi chỗ 2 công việc
                        int tmp1 = b[i];
                        b[i] = b[j];
                        b[j] = tmp1;

                        int tmp2 = a[i];
                        a[i] = a[j];
                        a[j] = tmp2;
                    }
                }
            }
            Arrays.sort(cv, new Comparator<Cv>() {
                @Override
                public int compare(Cv o1, Cv o2) {
                    return o1.end - o2.end;
                }
            });

            int count = 0;
            int end = -1;
            for (int i = 0; i < n; i++) {
                if (cv[i].start >= end) {
                    count++;
                    end = cv[i].end;
                }
            }
            System.out.println(count);
        }
    }
}


