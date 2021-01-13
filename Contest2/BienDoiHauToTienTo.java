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
public class BienDoiHauToTienTo {
    static String[] stack = new String[100000];
    static int head;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String suffix = in.nextLine();
            int n = suffix.length();
            head=-1;
            for (int i = 0; i < n; i++) {
                char c = suffix.charAt(i);
                if (!isOperand(c)){
                    stack[++head]=String.valueOf(c);
                } else {
                    String op1 = stack[head--];
                    String op2 = stack[head--];
                    stack[++head] = c+op2+op1;
                }
            }
            System.out.println(stack[0]);
        }
    }
    static boolean isOperand(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') return true;
        return false;
    }
}

