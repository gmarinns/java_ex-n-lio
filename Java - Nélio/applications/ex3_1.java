package applications;

import java.util.Scanner;

public class ex3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();
        while(senha != 200){
            System.out.println("Tente Novamente");
            senha = sc.nextInt();
        }
        System.out.println("Senha permitida");

        sc.close();
    }

}
