package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ex7_2_1;
import entities.ex7_2_2;
import entities.ex7_2_3;
import entities.ex7_2_4;
import entities.enums.ex7_2_5;

public class ex7_2 {

    public static void main(String args[]) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Dados do cliente
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        ex7_2_2 client = new ex7_2_2(name, email, birthDate);

        // Dados do pedido
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        ex7_2_5 status = ex7_2_5.valueOf(sc.next().toUpperCase());

        ex7_2_1 order = new ex7_2_1(new Date(), status, client);

        // Adicionar itens ao pedido
        System.out.print("How many items to this order? ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine(); // Consome o \n
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            ex7_2_4 product = new ex7_2_4(productName, productPrice);
            ex7_2_3 item = new ex7_2_3(quantity, productPrice, product);

            order.addItem(item);
        }

        // Resultado final
        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
