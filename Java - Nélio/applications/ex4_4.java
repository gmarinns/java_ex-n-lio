package applications;

import java.util.Scanner;

public class ex4_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            double z = x / y;
            if(z != 0){
                System.out.println(z);
            }
            else{
                System.out.println("Divisão impossível");
            }
        }
        sc.close();
    }
}
