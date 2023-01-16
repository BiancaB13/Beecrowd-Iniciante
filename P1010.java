import java.util.Scanner; 
import java.util.Locale;

public class P1010 {
    public static void main(String[] args) {
 
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in); 
        //int p1 = input.nextInt();
        int np1 = input.nextInt();
        double v1 = input.nextDouble();
        
        //int p2 = input.nextInt();
        int np2 = input.nextInt();
        double v2 = input.nextDouble();
        
        double T = np1*v1 + np2*v2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", T);
        input.close();
 
    }
}

/*
 
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. 
Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". 
O valor deverá ser apresentado com 2 casas após o ponto.

 */