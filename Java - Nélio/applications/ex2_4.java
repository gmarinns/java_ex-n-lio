package applications;

public class ex2_4 {
    public static void main(String[] args) {
        int x = 2;
        int y = 16;
        int duracao;
        if(x < y){
            duracao = y - x;
        }
        else{
            duracao = 24 - x + y;
        }
        System.out.println(duracao);
    }
}
