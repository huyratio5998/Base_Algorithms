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

public class DaoTu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder(str);
            Stack<Character> stack = new Stack<>();
            while(sb.length()>0){
                char ch = sb.charAt(0);
                sb.deleteCharAt(0);
                if (ch != ' ') {
                    stack.add(ch);                    
                } else {
                    in(stack);
                    System.out.print(" ");
                }
            }
            in(stack);
            System.out.println("");
        }
    }
    public static void in(Stack<Character> stack) {
        while (stack.size() > 0) {
            System.out.print(stack.pop());
        }
    }
}
