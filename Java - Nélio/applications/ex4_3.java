package applications;

import java.util.Scanner;

public class ex4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 3;

        for(int i=0;i<N;i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double mp = ((a * 2) + (b * 3) + (c * 5)) / (2 + 3 + 5);
            System.out.println(mp);
        }


        sc.close();
    }
}
