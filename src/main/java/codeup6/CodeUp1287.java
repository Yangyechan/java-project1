package codeup6;

import java.util.Scanner;

public class CodeUp1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= a * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
