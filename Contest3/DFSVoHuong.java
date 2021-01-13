package T321;

import java.util.*;

public class DFSVoHuong {
    static List<Integer>[] list;
    static int[] check;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            list = (List<Integer>[]) new List[1005];
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList<>();
            }

            int v = in.nextInt();
            int e = in.nextInt();
            int u = in.nextInt();
            check = new int[v + 5];
            for (int i = 0; i < e; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                list[a].add(b);
                list[b].add(a);
            }
            Arrays.fill(check, 1);
            DFS(u);
            System.out.println();
        }
    }

    public static void DFS(int u) {
        check[u] = 0;
        System.out.print(u + " ");
        for (int i = 0; i < list[u].size(); i++) {
            int v = list[u].get(i);
            if(check[v]==1) DFS(v);
        }
    }

}
