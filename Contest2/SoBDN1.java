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
public class SoBDN1 {
    static String n;
    static int count;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            n = in.nextLine();
            count = 0;
            Try("1");
            System.out.println(count);
        }
    }
    static boolean notBigger(String a, String b) {
        if (a.length() < b.length()) {
            return true;
        }
        if (a.length() > b.length()) {
            return false;
        }
        return a.compareTo(b) <= 0;
    }
    static void Try(String num) {
        if (notBigger(num, n)) {
            count++;
            Try(num + "0");
            Try(num + "1");
        }
    }
}
