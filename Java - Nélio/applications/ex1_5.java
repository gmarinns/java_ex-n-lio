package applications;

import java.util.Scanner;

public class ex1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int pessa1 = sc.nextInt();
        double price1 = sc.nextDouble();
        double multi = pessa1 * price1;

        int number2 = sc.nextInt();
        int pessa2 = sc.nextInt();
        double price2 = sc.nextDouble();
        double multi2 = pessa2 * price2;

        double soma = multi + multi2;

        System.out.println(soma);

        sc.close();




    }
}
