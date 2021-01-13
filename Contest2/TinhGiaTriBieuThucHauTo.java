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
public class TinhGiaTriBieuThucHauTo {
    static int[] stack = new int[20];
    static int head;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String exp = in.nextLine();
            int n = exp.length();
            head = -1;
            for (int i = 0; i <n; i++) {
                char c = exp.charAt(i);
                if (c >= '0' && c <= '9') {
                    stack[++head] = Integer.parseInt(String.valueOf(c));
                } else {
                    int op1 = stack[head--];
                    int op2 = stack[head--];
                    switch (c) {
                        case '+':
                            stack[++head] = op1 + op2;
                            break;
                        case '-':
                            stack[++head] = op2 - op1;
                            break;
                        case '*':
                            stack[++head] = op1 * op2;
                            break;
                        case '/':
                            stack[++head] = op2 / op1;
                            break;
                    }
                }
            }
            System.out.println(stack[0]);
        }
    }
}

