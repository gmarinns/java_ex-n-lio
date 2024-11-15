package applications;

import entities.*;
import java.util.Locale;
import java.util.Scanner;

public class ex5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ex5_2_1 emp = new ex5_2_1();

        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("Employee: " + emp.name + ", $ " + emp.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("Updated data: " + emp);

        sc.close();
    }
}
