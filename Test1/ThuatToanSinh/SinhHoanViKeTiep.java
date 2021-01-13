/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1.ThuatToanSinh;

import java.util.*;
public class SinhHoanViKeTiep {
    public static void main(String[] args) {
        int t,n;
        int a[]=new int[1000];
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-- >0){
            n=sc.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i]=sc.nextInt();                
            }   
            SinhHV(a, n);            
        }
    }
    public static void SinhHV(int[] str,int n){
        
        int i=n-1;
        int j;
        while(i>0 && str[i]>str[i+1]) i--;
        if(i>0){
            j=n;
            while(j>i && str[j]<str[i]) j--;
            int t=str[j]; str[j]=str[i]; str[i]=t;
            int d=i+1,c=n;
            while(d<c){
                int m=str[d]; str[d]=str[c]; str[c]=m;
                d++; c--;
            }            
        }
        StringBuilder sb=new StringBuilder();        
        for (int k = 1; k <= n; k++) {
            sb.append(str[k]);
            sb.append(" ");            
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
