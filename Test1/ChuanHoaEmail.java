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
public class ChuanHoaEmail {
    public static class wordTime{        
        String word;
        int count;
    }
    public static ArrayList<wordTime> lstResult=new ArrayList<wordTime>();
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String Str=sc.nextLine();
            getEmail(Str);
        }
    }        
    public static void getEmail(String str){
        StringTokenizer token=new StringTokenizer(str);
        ArrayList<String> lstWords=new ArrayList<>();
        
        String posfix="@ptit.edu.vn";
        StringBuilder result=new StringBuilder();
        while(token.hasMoreTokens()){
            lstWords.add(token.nextToken().toLowerCase());
        }
        String name=lstWords.get(lstWords.size()-1);
        result.append(name);
        for (int i = 0; i <= lstWords.size()-2; i++) {
            char first=lstWords.get(i).charAt(0);            
            result.append(first);
        }        
        //check trong list co ton tai result chua. Neu co + voi count cu va in ra
        // chua co thi in ra.
        wordTime newObj=new wordTime();            
            newObj.word=result.toString(); 
            newObj.count=1;
        for (int i = 0; i <= lstResult.size()-1; i++) {
            wordTime obj=lstResult.get(i);            
            if(obj.word.equals(result.toString())){
                newObj.count+=obj.count;                      
                lstResult.set(i, newObj);                
                System.out.println(result.append(newObj.count).append(posfix).toString());
                return;
            }            
        }    
        lstResult.add(newObj);
        System.out.println(result.append(posfix).toString());
    }
}
