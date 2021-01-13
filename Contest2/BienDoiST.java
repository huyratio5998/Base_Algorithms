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
public class BienDoiST {
     
    public static int tinh(int s, int t){
        if(s>=t) return s-t;
        int dem=0;
        if(t%2==1){
            dem=1;
            t++;
        }
        return (dem+1+ tinh(s, t/2));
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test= sc.nextInt();
        while(test-->0){
            int s= sc.nextInt();
            int t=sc.nextInt();
            
            int dem=0;
            if(s>=t) dem=s-t;
            else{
                
                dem=tinh(s,t);
            }
            
            System.out.println(dem);
        }
    }
}
 