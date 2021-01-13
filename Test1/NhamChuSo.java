package TN27;

import java.util.Scanner;

public class NhamChuSo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String A = in.next();
        String B = in.next();

        System.out.println(tim(A,B));

    }

    public static String tim(String A, String B) {
        String minA = A.replaceAll("6","5");
        String maxA = A.replaceAll("5","6");
        String minB = B.replaceAll("6","5");
        String maxB = B.replaceAll("5", "6");

        long min = Long.parseLong(minA) + Long.parseLong(minB);
        long max = Long.parseLong(maxA) + Long.parseLong(maxB);

        return min+" "+max;
    }

}
