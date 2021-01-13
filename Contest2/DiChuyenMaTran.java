/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest2;

/**
 *
 * @author Lan
 */
import java.util.*;
public class DiChuyenMaTran {
    static int n, m;
    static int[][] matrix;
    static int[][] vs;
    static int[] queuer = new int[1000000];
    static int[] queuec = new int[1000000];
    static int head, tail;
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            m = in.nextInt();
            matrix = new int[n + 1][m + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    matrix[i][j] = in.nextInt();
                }
            }
            vs = new int[n + 1][m + 1];
            System.out.println(bfs());
        }
    }
    static int bfs() {
        head = 0;
        tail = 0;
        queuer[0] = 1;
        queuec[0] = 1;
        vs[1][1] = 1;
        while (head <= tail) {
            int topr = queuer[head];
            int topc = queuec[head];
            int topm = vs[topr][topc];
            int step = matrix[topr][topc];
            head++;
            if (topr==n && topc==m) return topm-1;

            // A [i] [j+A[i][j]]
            int tmpr = topr;
            int tmpc = topc + step;
            if (tmpr >= 1 && tmpr <= n && tmpc >= 1 && tmpc <= m && vs[tmpr][tmpc] == 0) {
                tail++;
                queuer[tail] = tmpr;
                queuec[tail] = tmpc;
                vs[tmpr][tmpc] = topm + 1;
            }

            // A [i+A[i][j]] [j]
            tmpr = topr + step;
            tmpc = topc;
            if (tmpr >= 1 && tmpr <= n && tmpc >= 1 && tmpc <= m && vs[tmpr][tmpc] == 0) {
                tail++;
                queuer[tail] = tmpr;
                queuec[tail] = tmpc;
                vs[tmpr][tmpc] = topm + 1;
            }
        }
        return -1;
    }  
}

