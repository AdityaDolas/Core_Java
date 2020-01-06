package com.aditya.jaca2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class codeChefJan_6_2020 {
}


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(a);
    }
}

class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(sc.readLine());

        System.out.println(i);

    }
}

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a > 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int result = i % j;
            System.out.println(result);
            a--;
        }
    }
}

class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a > 0) {

            /*int i=sc.nextInt();

            while (i>=10) {
                i/=10;
            }
            System.out.println("first digit"+i);

            int lastDigit = i%10;

            System.out.println("last digit"+lastDigit);*/

            a--;
        }

    }
}

class Main4 {

    public static int firstDigit(int n) {
        while (n >= 10) {
            n /= 10;
        }

        return n;
    }

    public static int lastDigir(int n) {
        return (n % 10);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a > 0) {
            int n = sc.nextInt();

            System.out.println(firstDigit(n) + lastDigir(n));

            a--;

        }
    }


}
