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
public class BienDoiTienToHauTo {
    static String[] stack = new String[100000];
    static int head;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String prefix = in.nextLine();
            int n = prefix.length();
            head=-1;
            for (int i = n - 1; i >= 0; i--) {
                char c = prefix.charAt(i);
                if (!isOperand(c)){
                    stack[++head]=String.valueOf(c);
                } else {
                    String op1 = stack[head--];
                    String op2 = stack[head--];
                    stack[++head] = op1+op2+c;
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

