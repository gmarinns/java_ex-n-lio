package applications;

public class ex2_6 {
    public static void main(String[] args) {
        double x = 100.01;

        if (x >= 25 && x <= 50){
            System.out.println("Intervalo [25,50]");
        }
        else if (x >= 0 && x <= 25){
            System.out.println("Intervalo [0,25]");
        }
        else if (x >= 75 && x <= 100){
            System.out.println("Intervalo [75,100]");
        }
        else{
            System.out.println("Fora do intervalo");
        }
    }
}
