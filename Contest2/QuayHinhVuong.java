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
import java.util.*;
public class QuayHinhVuong {
    static HashSet<String> vs;

    static class HV {
        public int[] arr = new int[6];

        public boolean equals(int[] arr2) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) return false;
            }
            return true;
        }

        public HV() {

        }

        public HV(int[] newarr) {
            for (int i = 0; i < 6; i++) {
                arr[i] = newarr[i];
            }
        }

        public boolean visited() {
            return vs.contains(toString());
        }

        public void markVisit() {
            vs.add(toString());
        }

        public void rotate1() {
            int tmp=arr[0];
            arr[0]=arr[3];
            arr[3]=arr[4];
            arr[4]=arr[1];
            arr[1]=tmp;
        }

        public void rotate2(){
            int tmp=arr[1];
            arr[1]=arr[4];
            arr[4]=arr[5];
            arr[5]=arr[2];
            arr[2]=tmp;
        }

        public void print() {
            for (int i = 0; i < 6; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        @Override
        public String toString() {
            StringBuilder str = new StringBuilder();
            for (int i=0;i<6;i++) str.append(arr[i]);
            return str.toString();
        }
    }

    static HV[] queue = new HV[1000];
    static int[] steps = new int[1000];
    static int head, tail;
    static HV start = new HV();
    static HV end = new HV();

    static int solution() {
        head = 0;
        tail = 0;
        queue[0] = start;
        steps[0] = 0;
        start.markVisit();
        while (head <= tail) {
            HV top = queue[head];
            int topstep = steps[head];
            head++;
            if (top.equals(end.arr)) {
                return topstep;
            }

            HV left = new HV(top.arr);
            left.rotate1();
            if (!left.visited()) {
                tail++;
                left.markVisit();
                queue[tail] = left;
                steps[tail] = topstep + 1;
            }

            HV right = new HV(top.arr);
            right.rotate2();
            if (!right.visited()) {
                tail++;
                right.markVisit();
                queue[tail] = right;
                steps[tail] = topstep + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            start = new HV();
            end = new HV();
            for (int i = 0; i < 6; i++) {
                start.arr[i] = in.nextInt();
            }
            for (int i = 0; i < 6; i++) {
                end.arr[i] = in.nextInt();
            }
            vs = new HashSet<>();
            System.out.println(solution());

        }
    }
}