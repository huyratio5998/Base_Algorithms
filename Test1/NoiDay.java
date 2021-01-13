/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.util.*;

public class NoiDay {
    public static void main(String[] args) {
        long mod = (long) (10e8 + 7);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            PriorityQueue<Long> pqueue = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                long tmp = sc.nextLong();
                pqueue.add(tmp);
            }
            // add number to pqueue. Order by assencding    
            long sum = 0;
            while (pqueue.size() > 1) {
                long tmp1 = pqueue.poll();
                long tmp2 = pqueue.poll();
                long tmp3 = (tmp1 + tmp2) % mod;
                pqueue.add(tmp3);
                sum = (sum + tmp3) % mod;
            }
            System.out.println(sum % mod);
        }

    }
}
