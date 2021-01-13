/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1.ThuatToanSinh;

/**
 *
 * @author huyng
 */
import java.util.*;
public class SinhNhiPhanKeTiep {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-- >0){
            char[] str=sc.next().toCharArray();
            System.out.println(NextBinary(str));
        }
    }
    public static char[] NextBinary(char[] str){        
        int i=str.length-1;
        while(i>=0 && str[i]=='1'){
            str[i]='0';
            i--;
        }
        if(i>=0){
            str[i]='1';
        }     
        return str;
    }
}
