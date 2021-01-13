package T323;

import java.util.*;

public class DuongDiVoHuongDFS {
    static List<Integer>[] list = (List<Integer>[]) new List[1005];
    static int[] check;
    static int[] before;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList<>();
            }
            int v = in.nextInt();
            int e = in.nextInt();
            int s = in.nextInt();
            int t = in.nextInt();
            check = new int[v + 5];
            before = new int[v + 5];
            for (int i = 0; i < e; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                list[a].add(b);
                list[b].add(a);
            }
            Arrays.fill(check, 1);
            solve(s, t);
            System.out.println();
        }
    }

    public static void solve(int s,int t) {
        traceDFS(s);
        if (before[t] == 0) {
            System.out.println("-1");
        } else {
            Stack<Integer> stack = new Stack<>();
            stack.push(t);
            int u = before[t];
            while (u != s) {
                stack.push(u);
                u = before[u];
            }
            stack.push(s);
            while (!stack.isEmpty()) {
                System.out.print(stack.pop()+" ");
            }
        }
    }

    public static void traceDFS(int s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        check[s] = 0;
        while (!stack.empty()) {
            int u = stack.pop();
            for (int i = 0; i < list[u].size(); i++) {
                int v = list[u].get(i);
                if (check[v] == 1) {
                    check[v]=0;
                    stack.push(u);
                    stack.push(v);
                    before[v] = u;
                    break;
                }
            }
        }
    }

}
