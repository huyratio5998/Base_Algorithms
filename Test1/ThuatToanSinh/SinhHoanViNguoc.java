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
public class SinhHoanViNguoc {
    public static boolean OK;
    public static int a[]=new int[10];
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            // khoi tao
            OK=false;
            int dem=n;
            for (int i = 1; i <=n; i++) {                
                a[i]=dem;
                dem--;
            }
            while(OK==false){
                 //in ra            
                In(n);                
                //sinh
                Sinh(n);               
            }         
            System.out.println("");
        }
    }
    public static void In(int n){
        for (int i = 1; i <=n; i++) {
            System.out.print(a[i]);                                
        }
            System.out.print(" ");
        
    }
    public static void Sinh(int n){
        int i=n-1;
        while(i>0&&a[i]<a[i+1]) i--;
        if(i>0){
            int j=n;
            while(a[j]>a[i]) j--;
            int t=a[j];a[j]=a[i];a[i]=t;
            int d=i+1,c=n;
            while(d<c){
                t=a[d];a[d]=a[c];a[c]=t;
                d++;c--;
            }
        }else OK=true;
    }
}
