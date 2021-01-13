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

public class TranhVatCan {

    static int n;
    static int[][] map;
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};
    static int[][] vs;
    static int[] queuer = new int[100000];
    static int[] queuec = new int[100000];
    static int head, tail;
    static int startr, startc, endr, endc;

    static void mark(int row, int col, int move) {
        int tmp;
        tmp = row - 1;
        while (tmp >= 0 && map[tmp][col] == 0) {
            if (vs[tmp][col] == -1 || vs[tmp][col] > move) {
                vs[tmp][col] = move;
                tail++;
                queuer[tail] = tmp;
                queuec[tail] = col;
            }
            tmp--;
        }
        tmp = row + 1;
        while (tmp < n && map[tmp][col] == 0) {
            if (vs[tmp][col] == -1 || vs[tmp][col] > move) {
                vs[tmp][col] = move;
                tail++;
                queuer[tail] = tmp;
                queuec[tail] = col;
            }
            tmp++;
        }
        tmp = col - 1;
        while (tmp >= 0 && map[row][tmp] == 0) {
            if (vs[row][tmp] == -1 || vs[row][tmp] > move) {
                vs[row][tmp] = move;
                tail++;
                queuer[tail] = row;
                queuec[tail] = tmp;
            }
            tmp--;
        }
        tmp = col + 1;
        while (tmp < n && map[row][tmp] == 0) {
            if (vs[row][tmp] == -1 || vs[row][tmp] > move) {
                vs[row][tmp] = move;
                tail++;
                queuer[tail] = row;
                queuec[tail] = tmp;
            }
            tmp++;
        }
    }

    static void bfs(int sr, int sc) {
        head = 0;
        tail = 0;
        queuer[0] = sr;
        queuec[0] = sc;
        vs[sr][sc] = 1;
        mark(sr, sc, 1);

        while (head <= tail) {

            int topr = queuer[head];
            int topc = queuec[head];
            int topv = vs[topr][topc];
            head++;
            mark(topr, topc, topv + 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            n = Integer.parseInt(in.nextLine());
            map = new int[n][n];
            vs = new int[n][n];
            for (int i = 0; i < n; i++) {
                String tmp = in.nextLine();
                for (int j = 0; j < n; j++) {
                    if (tmp.charAt(j) == '.') {
                        map[i][j] = 0;
                    } else {
                        map[i][j] = 1;
                    }
                    vs[i][j] = -1;
                }
            }
            startr = in.nextInt();
            startc = in.nextInt();
            endr = in.nextInt();
            endc = in.nextInt();
            in.nextLine();
            bfs(startr, startc);
            System.out.println(vs[endr][endc]);
        }

    }
}
