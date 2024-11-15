package applications;

import java.util.Scanner;

public class ex4_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = 0;
        int B = 1;
        int C = 1;

        for (int i = 1; i <= N; i++) {
            A = i;
            B = i * i;
            C = i * i * i;
            System.out.println(A + " " + B + " " + C);
        }
        sc.close();
    }
}
