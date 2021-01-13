package T327;

import java.util.*;

public class KiemTraChuTrinh {
    static int[] dem1 = new int[1005];
    static int[] dem2 = new int[1005];
    static int m;
    static Queue<Integer> queue = new LinkedList<>();

    static ArrayList<ArrayList<Integer>> lists;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int v = in.nextInt();
            int e = in.nextInt();
            lists = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i <= v; i++) {
                lists.add(new ArrayList<>());
            }
            for (int i = 0; i < e; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                lists.get(a).add(b);
                lists.get(b).add(a);
            }
            for (int i = 0; i <= v; i++) {
                dem1[i] = dem2[i] = 0;
            }
            m = 0;
            for (int i = 1; i <= v; i++) {
                if (dem1[i] == 0) {
                    dem1[i]=1;
                    BFS(i);
                    if (m == 1) {
                        break;
                    }
                }
            }
            if(m==1) System.out.println("YES");
            else System.out.println("NO");

        }
    }

    public static void BFS(int u) {
        queue.clear();
        queue.add(u);
        while (!queue.isEmpty()) {
            int s = queue.poll();
            for (int i : lists.get(s)) {
                if (dem1[i] == 0) {
                    dem1[i]=1;
                    dem2[i]=s;
                    queue.add(i);
                } else if (i != dem2[s]) {
                    m = 1;
                    return;
                }
            }
        }
    }
}
