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
public class SoNhiPhan1_N {
    static String[] queue = new String[10003];
    static int head, tail;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        head=1;
        tail=1;
        queue[1]="1";
        while (tail<=10000){
            String top = queue[head++];
            queue[++tail] = top+"0";
            queue[++tail] = top+"1";
        }
        int t = in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            for (int i=1;i<=n;i++)
            System.out.print(queue[i]+" ");
            System.out.println();
        }
    }
}

