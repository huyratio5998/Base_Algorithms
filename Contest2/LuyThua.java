/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest2;

/**
 *
 * @author Lan
 */
import java.math.BigInteger;
import java.util.*;
public class LuyThua {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int k=sc.nextInt();
            long  n=sc.nextLong();
            int M=1000000007;
            long result=BigInteger.valueOf(k).modPow(BigInteger.valueOf(n), BigInteger.valueOf(M)).longValue();
            System.out.println(result);
        }
        
    }
}
