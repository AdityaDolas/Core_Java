package com.aditya.jaca2;

import java.util.Scanner;

public class BufferedInputeStream {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            int j = sc.nextInt();
            int sum = i + j;
            System.out.println(sum);
        }
    }
}

class looop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int j = 0; j <= a; j++) {
            System.out.println(j);
        }
    }
}
