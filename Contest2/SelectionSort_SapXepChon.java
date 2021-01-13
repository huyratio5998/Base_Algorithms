/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest2;

import java.util.*;
public class SelectionSort_SapXepChon {
   static int [] A=new int[100];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),min;
        for (int i = 0; i < n; i++) {
            A[i]=sc.nextInt();
        }        
        for (int i = 0; i < n-1; ++i) {   
            boolean print=false;
            min=i;
            for (int j = i+1; j < n; j++) {                                                                
                if(A[j]<A[min]) min=j;                                                                 
            }            
                     int t=A[min];
                    A[min]=A[i];
                    A[i]=t;                    
                    print=true;               
            if(print) in(n,i+1);
        }   
    }
     public static void in(int n,int k){
        StringBuilder result=new StringBuilder();
        result.append("Buoc "+k+": ");
        for (int i = 0; i < n; i++) {
            result.append(A[i]+" ");            
        }
        result.deleteCharAt(result.length()-1);
        System.out.println(result.toString());
    }
}
