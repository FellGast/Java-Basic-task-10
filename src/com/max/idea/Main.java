package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int n = 0;
        int m = 0;
        System.out.println("Введите размер матрицы");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] mat = new int[m][n];
        System.out.println("Введите элементы матрицы");
        for(int i = 0; i < m; i++)
        {
            for(int j =0; j<n; j++){
                int t = sc.nextInt();
                mat[i][j] = t;
            }
        }
        sc.close();
        for(int i = 0; i < n; i++)
        {
            double r = mat[0][i];
            double mula = 3*r;
            System.out.print(String.format("%s ", mula));
        }
    }
}
