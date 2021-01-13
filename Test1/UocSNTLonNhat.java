/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.util.Scanner;

public class UocSNTLonNhat {
   
    public static long maxSNT(long n){
        if(n==2) return n;
        while(n%2==0) n/=2;
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            while(n%i==0){
                n/=i;
            }
        }       
        return n;
    }
    public static void main(String[] args) {
        int t;
        long n;
        
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
                // tim uoc
               n=sc.nextLong();            
               System.out.println(maxSNT(n));                                          
        }                             
    }
}
