package applications;

import entities.ex6_1_1;
import java.util.Locale;
import java.util.Scanner;

public class ex6_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ex6_1_1 banco = new ex6_1_1();

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        banco.setAccountNumber(accountNumber);

        System.out.print("Enter account holder: ");
        String accountHolder = sc.next();
        banco.setAccountHolderName(accountHolder);

        System.out.print("Is there na initial deposit (y/n)? ");
        if(sc.next().equalsIgnoreCase("y")){
            System.out.print("Enter initial deposit value: ");
            double inicialBalance = sc.nextDouble();
            banco.setInicialBalance(inicialBalance);
        }

        System.out.println("Account data: ");
        System.out.print("Holder: " + banco.getAccountHolderName() + ", ");
        System.out.print("Balance: $ " + String.format("%.2f", banco.getInicialBalance()));

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        banco.addBalance(depositValue);  // Adiciona o valor do depósito
        System.out.println("Updated account data:");
        System.out.println("Holder: " + banco.getAccountHolderName() + ", Balance: $ " + String.format("%.2f", banco.getInicialBalance()));

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        banco.removeBalance(withdrawValue);
        System.out.println("Updated account data:");
        System.out.print("Holder: " + banco.getAccountHolderName() + ", ");
        System.out.print("Balance: $ " + String.format("%.2f", banco.getInicialBalance()));

        sc.close();
    }
}
