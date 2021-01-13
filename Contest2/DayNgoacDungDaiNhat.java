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
// not ok
import java.util.*;
public class DayNgoacDungDaiNhat {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String str=sc.next();                        
            System.out.println(check(str));
        }
    }
      public static int check(String str){
          Stack<Character> stack=new Stack<>();   
          int dem=0;
          for (int i = 0; i < str.length(); i++) {
              char c=str.charAt(i);
              if(c=='('){
                  stack.push(c);
              }else{
                  if(!stack.empty()){
                      if(c==')'&& stack.peek()!='(') continue;
                      stack.pop();
                      dem+=2;
                  }else if(c==')')continue;                                                      
              }             
          }
          return dem;
      }
}
