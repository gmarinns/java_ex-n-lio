package applications;

import java.util.Locale;
import java.util.Scanner;
import entities.ex5_1_1;

public class ex5_1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ex5_1_1 rect = new ex5_1_1();

        System.out.println("Enter the rectangle width and height: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        System.out.println("Area: " + rect.area(width, height));
        System.out.println("Perimeter: " + rect.perimeter(width, height));
        System.out.println("Diagonal: " + rect.diagonal(width, height));


        sc.close();

    }
}
