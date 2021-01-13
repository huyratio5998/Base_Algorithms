
package Test1;


import java.util.*;
public class ChuanHoaXau {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String str=sc.nextLine();
            System.out.println(chuanHoa(str));
        }
    }
    public static String chuanHoa(String str){
        StringBuilder result=new StringBuilder();
        StringTokenizer token=new StringTokenizer(str);
        while(token.hasMoreTokens()){       
            String x=token.nextToken().toLowerCase();
        result.append(Character.toUpperCase(x.charAt(0)));
            for (int i = 1; i <= x.length()-1; i++) {
                result.append(x.charAt(i));
            }
        result.append(" ");
        }        
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}
