package com.company;

import java.util.Scanner;

public class Sravnenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a + b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }

    }
}
