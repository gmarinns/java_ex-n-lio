package applications;

import java.util.Scanner;

public class ex4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int somain = 0;
        int somaout = 0;

        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            if(x>= 10 && x<=20){
                somain = somain + 1;
            }
            else{
                somaout = somaout + 1;
            }
        }
        System.out.println(somain + " in");
        System.out.println(somaout + " out");
        sc.close();
    }
}
