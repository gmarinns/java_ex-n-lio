package applications;

import entities.*;
import java.util.Locale;
import java.util.Scanner;

public class ex5_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ex5_3_1 emp = new ex5_3_1();

        double notaAprovada = 60.00;

        System.out.print("Digite o nome do aluno: ");
        emp.name = sc.nextLine();
        System.out.println("Digite as notas: ");
        emp.nota1 = sc.nextDouble();
        emp.nota2 = sc.nextDouble();
        emp.nota3 = sc.nextDouble();

        System.out.println("FINAL GRADE: " + emp.notaFinal());
        if(emp.notaFinal()>notaAprovada){
            System.out.println("O aluno aprovado com sucesso!");
        }
        else{
            System.out.println("O aluno foi reprovado!");
        }

    }
}
