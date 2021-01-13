/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest2;

import java.util.*;
public class KiemTraNgoacDung {
    
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String str=sc.nextLine();                        
            if(check(str)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
      public static boolean check(String str){
          Stack<Character> stack=new Stack<>();          
          for (int i = 0; i < str.length(); i++) {
              char c=str.charAt(i);
              if(c=='['||c=='{'||c=='('){
                  stack.push(c);
              }else{
                  if(!stack.empty()){
                      if(c==')'&& stack.peek()!='(') return false;
                      if(c=='}'&& stack.peek()!='{') return false;
                      if(c==']'&& stack.peek()!='[') return false;
                      stack.pop();
                  }else return false;
              }             
          }
          return stack.empty()==true;
      }
}
    