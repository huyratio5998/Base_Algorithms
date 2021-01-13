/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest2;

/**
 *
 * @author huyng
 */

import java.util.*;

public class BienDoiSNT {
    static int t;
    static int bg, ed;
    static TreeSet<Integer> prime = new TreeSet<>();
    public static void main(String[] args) {
        for(int i = 1000; i <= 9999; i++){
            boolean is_prime = true;
            for(int j = 2; j <= (int)Math.sqrt(i); j++){
                if(i%j==0){
                    is_prime = false;
                    break;
                }
            }
            if(is_prime){
                prime.add(i);
            }
        }
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        while(t-->0){
            bg = input.nextInt();
            ed = input.nextInt();
            System.out.println(bfs());
        }
    }
    static int bfs(){
        TreeSet<Integer> exist = new TreeSet<>();
        exist.add(bg);
        Queue<Integer> q = new LinkedList<>();
        q.add(bg);
        int ans = 0;
        while(q.size()>0){
            int sz_loop = q.size();
            while(sz_loop-->0){
                int val = q.poll();
                if(val==ed) return ans;
                StringBuffer tmp = new StringBuffer(String.valueOf(val));
                for(int i = 0; i < 4; i++){
                    char x = tmp.charAt(i);
                    for(int j = 0; j < 10; j++){
                        if(i+j>0){
                            tmp.setCharAt(i, (char)(j+'0'));
                            int nx = Integer.parseInt(new String(tmp));
                            if(prime.contains(nx) && !exist.contains(nx)){
                                exist.add(nx);
                                q.add(nx);
                            }
                        }
                    }
                    tmp.setCharAt(i, x);
                }
            }
            ans++;
        }
        return -1;
    }
}