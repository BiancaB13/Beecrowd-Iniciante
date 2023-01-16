import java.util.Scanner;

public class P1009 {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);

        //String nome = input.next();
        double fixo = input.nextDouble();
        double vendas = input.nextDouble();

        double TOTAL = fixo + ((vendas * 15)/100) ;
        System.out.printf("TOTAL = R$ %.2f\n", TOTAL);
        input.close();
    }
}
