/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;
import java.util.*;
public class SoDep {
    static boolean  checkSoDep(String str){
        int x=0,y=str.length()-1;
        while(x<y){
            if(str.charAt(x)!=str.charAt(y)) return false;
            if((int)(str.charAt(x)-'0')%2==1) return false;
            x++;y--;
        }                
        if((int)(str.charAt(x)-'0')%2==1) return false;
        return true;
    }
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-- >0){
            String number=sc.next();
            if(checkSoDep(number)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
