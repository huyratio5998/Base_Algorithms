package Contest3;

import java.util.*;
public class DSCanhToKe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int v = in.nextInt();
            int e = in.nextInt();
            ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
            for (int i = 0; i <= v; i++) {
                lists.add(new ArrayList<>());
            }
            for (int i = 0; i < e; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                lists.get(a).add(b);
                lists.get(b).add(a);
            }
            for (int i = 1; i <= v; i++) {
                System.out.print(i + ": ");
                for (int j = 0; j < lists.get(i).size(); j++) {
                    System.out.print(lists.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }

}