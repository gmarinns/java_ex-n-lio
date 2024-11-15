package applications;

import entities.ex5_4_1;
import java.util.Locale;
import java.util.Scanner;

public class ex5_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ex5_4_1 obj = new ex5_4_1();

        System.out.print("What is the dollar price? ");
        obj.dollarPrice = sc.nextDouble();
        System.out.print("How Many dollars will be bought? ");
        obj.dollarAmount = sc.nextDouble();
        System.out.print("Amount to be paid in reais = " + obj.getAmountInReal());

    }
}
