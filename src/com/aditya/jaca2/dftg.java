package com.aditya.jaca2;

import java.util.Arrays;
import java.util.Scanner;

public class dftg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        while (t > 0) {
            // int n=sc.nextInt();

            for (int i = 0; i < t; i++) {
                arr[i] = sc.nextInt();
                Arrays.sort(arr);
            }
            for (int i : arr) {
                System.out.println(i);
            }
            t--;
        }

    }
}

