/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest2;

/**
 *
 * @author huyng
 */
import java.util.*;
public class SapXepNoiBot {
    static int [] A=new int[100];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k;
        for (int i = 0; i < n; i++) {
            A[i]=sc.nextInt();
        }
        for (int i = 0; i < n; ++i) {   
            boolean print=false;
            for (int j = 0; j < n-i-1; j++) {                                                                
                if(A[j]>A[j+1]){
                    int t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                    print=true;
                }                
            }
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
