/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.util.Scanner;

public class NQuanHau2 {
    static int maxScore;
    static int n;
    static int[][] board;
    static boolean[] row;
    static boolean[] forwardDiag;
    static boolean[] backwardDiag;

    static void Try(int k, int score) {
        if (k == n) {
            if (maxScore<score) maxScore=score;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!row[i] && !forwardDiag[i - k + n - 1] && !backwardDiag[i + k]) {
                row[i] = true;
                forwardDiag[i - k + n - 1] = true;
                backwardDiag[i +k] = true;
                Try(k + 1, score+board[i][k]);
                row[i] = false;
                forwardDiag[i - k + n - 1] = false;
                backwardDiag[i +k] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = 8;
            board = new int[n][n];
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    board[i][j]=in.nextInt();
                }
            }
            row = new boolean[n];
            forwardDiag = new boolean[n * 2];
            backwardDiag = new boolean[n * 2];
            maxScore = 0;
            Try(0, 0);
            System.out.println(maxScore);
        }
    }
}

