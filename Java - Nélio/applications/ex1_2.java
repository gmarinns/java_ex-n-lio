package applications;
import java.util.Scanner;

public class ex1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int raio = sc.nextInt();
        double pi = 3.14159265359;
        double area = pi * raio * raio;
        System.out.println("A= " + area);
        sc.close();
    }
}
