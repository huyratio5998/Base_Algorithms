package T325;

import java.util.*;

public class DemSoThanhPhanLienThong {
    static List<Integer>[] list = (List<Integer>[]) new List[1005];
    static int[] check;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList<>();
            }
            int v = in.nextInt();
            int e = in.nextInt();
            check = new int[v + 5];
            for (int i = 0; i < e; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                list[a].add(b);
                list[b].add(a);
            }
            int res = 0;
            for (int i = 1; i <= v; i++) {
                if (check[i] == 0) {
                    res++;
                    strongConnective(i);
                }
            }
            System.out.println(res);
        }
    }

    public static void strongConnective(int u) {
        check[u] = 1;
        for (int i = 0; i < list[u].size(); i++) {
            int v = list[u].get(i);
            if (check[v] == 0) {
                strongConnective(v);
            }
        }
    }

}
