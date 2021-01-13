/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest2;

import java.util.*;
public class InsertionSort_SapXepChen {
    static int [] A=new int[100];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),temp,j;
        for (int i = 0; i < n; i++) {
            A[i]=sc.nextInt();
        }
        System.out.println("Buoc 0: "+A[0]);
        for (int i = 1; i < n; i++) {               
            temp=A[i];
            j=i-1;
            
            while(j>=0 && A[j]>temp){
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=temp;            
            in(i+1,i);
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
