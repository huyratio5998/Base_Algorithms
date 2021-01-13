package T319;

import java.util.*;

public class DSKeToCanh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer>[] E = (List<Integer>[]) new List[1005];
        for (int i = 0; i < E.length; i++) {
            E[i] = new ArrayList<Integer>();
        }
        in.nextLine();
        for (int i = 1; i <= n; i++) {
            String str = in.nextLine();
            String[] arrStr = str.split(" ");
            for (String s : arrStr) {
                E[i].add(Integer.parseInt(s));
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < E[i].size(); j++) {
                if (E[i].get(j) > i) {
                    System.out.print(i + " ");
                    System.out.println(E[i].get(j));
                }
            }
        }
    }

}
