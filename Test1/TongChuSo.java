/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.util.*;

class Result{
    public StringBuilder str=new StringBuilder();
    public int dem=0;
}
public class TongChuSo {
    public static void main(String[] args) {
        int t;
        String n;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-- >0){
            n=sc.next();
            Result R=new Result();            
            char[] check=n.toCharArray(); 
            Arrays.sort(check);
            for (int i = 0; i < check.length; i++) {
                if(check[i]>='0'&&check[i]<='9') R.dem+=Integer.parseInt(String.valueOf(check[i]));
                else{
                    R.str.append(check[i]);                    
                }
            }            
            StringBuilder result=new StringBuilder();
            result.append(R.str);
            result.append(R.dem);
            System.out.println(result);
        }
    }
}
