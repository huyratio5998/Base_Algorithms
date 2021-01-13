package T328;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {
    static int v,e,u;
    static boolean[] d = new boolean[1005];
    static long[] truoc = new long[1005];
    static int base = 100000;
    static PriorityQueue<Long> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            v = in.nextInt();
            e = in.nextInt();
            u = in.nextInt();
            ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
            for (int i = 0; i <= v; i++) {
                lists.add(new ArrayList<>());
                d[i] = false;
                truoc[i] = 100000L;
            }
            for (int i = 1; i <= e; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                lists.get(a).add(c * base + b);
                lists.get(b).add(c * base + a);
            }
            d[u] = true;
            truoc[u] = 0;
            for (long x : lists.get(u)) {
                queue.add(x);
                truoc[(int) x % base] = x / base;
            }
            while (!queue.isEmpty()) {
                long temp = queue.poll();
                int i = (int) (temp % base);
                long c = temp / base;
                if (c != truoc[i] || d[i]) {
                    continue;
                }
                d[i] = true;
                for (long x : lists.get(i)) {
                    int t = (int) (x % base);
                    if (d[t]) {
                        continue;
                    }
                    long k = x / base;
                    if (truoc[t] > k + c) {
                        truoc[t] = k + c;
                        queue.add(base * truoc[t] + t);
                    }
                }
            }
            for (int i = 1; i <= v; i++) {
                if (i != u) {
                    System.out.print(truoc[i] + " ");
                } else System.out.print("0 ");
            }
            System.out.println();
        }

    }

}
