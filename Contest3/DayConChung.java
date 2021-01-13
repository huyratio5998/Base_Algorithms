package Contest3;

import java.util.Scanner;

public class DayConChung {
    static String X,Y,Z;
    static int x,y,z;
    static int[][][] C;
    public static void Try() {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                for (int k = 1; k <= z; k++) {
                    char temp = X.charAt(i-1);
                    if ((temp == Y.charAt(j - 1)) && (temp == Z.charAt(k-1))) {
                        C[i][j][k] = C[i-1][j-1][k-1]+1;
                    }
                    else {
                        C[i][j][k] = Math.max(C[i][j][k-1],Math.max(C[i-1][j][k],C[i][j-1][k]));
                    }
                }
            }
        }
        System.out.println(C[x][y][z]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-->0) {
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();
            in.nextLine();
            String str = in.nextLine();
            String[] arrStr = str.split(" ");
            C = new int[x + 3][y + 3][z + 3];
            X = arrStr[0];
            Y = arrStr[1];
            Z = arrStr[2];
            Try();
        }
    }
}
