package applications;

public class ex2_5 {
    public static void main(String[] args) {
        int codigo = 3;
        int qtd = 2;

        if(codigo == 1){
            System.out.println("Cachorro quente " + 4.00 * qtd);
        }
        else if(codigo == 2){
            System.out.println("X-Salada " + 4.50 * qtd);
        }
        else if(codigo == 3){
            System.out.println("X-Bacon " + 5.00 * qtd);
        }
        else if(codigo == 4){
            System.out.println("Torrada " + 2.00 * qtd);
        }
        else if(codigo == 5) {
            System.out.println("Refrigerante " + 1.50 * qtd);
        }
    }
}
