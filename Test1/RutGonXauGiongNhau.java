/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

/**
 *
 * @author huyng
 */
import java.util.*;
public class RutGonXauGiongNhau {
    public static void main(String[] args) {
        String n;
        Scanner sc=new Scanner(System.in);
        n=sc.next();
        System.out.println(RutGon(n));
    }
    public static String RutGon(String str){
        StringBuilder sb=new StringBuilder(str);
        for (int i = 0,j=1;i<= sb.length()-2 && j <= sb.length()-1;) {
            if(sb.charAt(i)==sb.charAt(j)){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);                
                i=0;j=1;
            }else{
                i++;j++;
            }
        }        
        if(sb.length()==0){
            return "Empty String";
        }else return sb.toString();        
    }
}
