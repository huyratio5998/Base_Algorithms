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
import java.util.*;

public class TongNhoNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                pq.add(sc.nextInt());
            }
            //
            ArrayList<Integer> A=new ArrayList<>();
            ArrayList<Integer> B=new ArrayList<>();            
            while(pq.size()>1){
                
                A.add(pq.poll());
                B.add(pq.poll());
            }
            if(pq.size()>0) A.add(pq.poll());
            // count            
            System.out.println(toNum(A)+toNum(B));
        }
    }
    public static long toNum(ArrayList<Integer> X){
        int n=X.size()-1;
        long result=0;
        for (int i = 0; i < X.size(); i++) {            
            result+=X.get(i)* Math.pow(10, n);
            n--;            
        }
        return result;
    }
}
