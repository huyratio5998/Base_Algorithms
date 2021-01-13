/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest2;

/**
 *
 * @author Lan
 */
import java.util.*;
public class SoBND2 {
    static int[] queue = new int[1000];
    static int head, tail;
    static boolean[] vs;
    static int[] put = new int[10000];
    static int[] prev = new int[10000];
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            vs = new boolean[n + 1];
            head = 0;
            tail = 0;
            queue[0] = 1 % n;
            prev[0]=-1;
            vs[1 % n] = true;
            put[0]=1;
            while (head <= tail) {
                int top = queue[head];
                int pos = head;
                head++;
                if (top==0){
                    printResult(pos);
                    break;
                }
                int tmp = (top*10)%n;
                if (!vs[tmp]){
                    tail++;
                    queue[tail]=tmp;
                    vs[tmp]=true;
                    put[tail]=0;
                    prev[tail]=pos;
                }
                tmp = (top*10 + 1)%n;
                if (!vs[tmp]){
                    tail++;
                    queue[tail]=tmp;
                    vs[tmp]=true;
                    put[tail]=1;
                    prev[tail]=pos;
                }
            }
        }
    }
    static void printResult(int pos){
        StringBuilder builder = new StringBuilder();
        while (prev[pos]!=-1){
            builder.insert(0, put[pos]);
            pos=prev[pos];
        }
        builder.insert(0, put[pos]);
        System.out.println(builder.toString());
    }  
}
