package T326;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LietKeDinhTru {

 static List<Integer>[] list = (List<Integer>[]) new List[1005];
    static boolean[] check;
    static int[] before;
    static int v,e;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList<>();
            }
            v = in.nextInt();
            e = in.nextInt();
            check = new boolean[v + 5];
            before = new int[v + 5];
            for (int i = 0; i < e; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                list[a].add(b);
                list[b].add(a);
            }
            int res =0;
            for (int i = 1; i <= v; i++) {
                if (!check[i]) {
                    res++;
                    DFS(i);
                }
            }
            for (int i = 1; i <= v; i++) {
                Arrays.fill(check, false);
                check[i] = true;
                int count = 0;
                for (int j = 1; j <= v; j++) {
                    if (!check[j]) {
                        count++;
                        DFS(j);
                    }
                }
                if(count>res)
                    System.out.print(i+" ");
            }
            System.out.println();

        }
    }

    static void DFS(int u) {
        check[u] = true;
        for (int i = 0; i < list[u].size(); i++) {
            int v = list[u].get(i);
            if (!check[v]) {
                before[v] = u;
                DFS(v);
            }
        }
    }

}
