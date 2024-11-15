package applications;

import java.util.Scanner;

public class ex1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int soma = n + m;
        System.out.println("SOMA = "+ soma);
        sc.close();
    }
}
