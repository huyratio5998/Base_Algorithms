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
import java.util.Scanner;
public class Fibonaci {
    public static void main(String[] args) {
        long f[]=new long[100];
        f[0]=0;f[1]=1;
        for (int i = 2; i <=92; i++) {
            f[i]=f[i-1]+f[i-2];
        }
        Scanner  sc=new Scanner(System.in);
        int t,d;
        t=sc.nextInt();
        while(t>0){
            d=sc.nextInt();
            System.out.println(f[d]);
            t--;            
        }
    }
}
