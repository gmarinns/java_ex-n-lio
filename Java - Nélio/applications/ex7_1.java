package applications;

import entities.enums.ex7_1_4;
import entities.ex7_1_1;
import entities.ex7_1_2;
import entities.ex7_1_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ex7_1 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);

        System.out.print("Enter the department's name: ");
        String departName = sc.nextLine();

        System.out.println("Enter the worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level (JUNIOR, MID, SENIOR): ");
        String level = sc.nextLine();
        ex7_1_4 levelEnum;
        try {
            levelEnum = ex7_1_4.valueOf(level.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid level. Please enter JUNIOR, MID, or SENIOR.");
            return;
        }

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        ex7_1_1 worker = new ex7_1_1(name, levelEnum, baseSalary, new ex7_1_3(departName));

        System.out.print("How many contracts to this worker? ");
        int contracts = sc.nextInt();

        for (int i = 1; i <= contracts; i++) {
            System.out.println("Enter the contract #" + i + ":");
            System.out.print("Date (dd/MM/yyyy): ");
            Date date = sdf.parse(sc.next());

            System.out.print("Value per hour: ");
            double value = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            if (value <= 0 || duration <= 0) {
                System.out.println("Invalid contract data. Value per hour and duration must be positive.");
                i--; // Permite reentrada dos dados
                continue;
            }

            ex7_1_2 hour = new ex7_1_2(date, value, duration);
            worker.addContract(hour);
        }

        System.out.print("Enter month and year to calculate income (MM/yyyy): ");
        String[] dateIncome = sc.next().split("/");
        int month = Integer.parseInt(dateIncome[0]);
        int year = Integer.parseInt(dateIncome[1]);

        System.out.println("\nName: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + dateIncome[0] + "/" + dateIncome[1] + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
