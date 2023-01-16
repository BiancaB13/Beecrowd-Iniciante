//precisei de ajuda com o calculo
//meia hora para descobrir que faltou o R$

//precisa decompor o valor do usuário
//exemplo: 576 
//5 notas de 100 reais, sobra 76
//1 nota de 50, sobra 26 e assim por diante 

import java.util.Scanner;

public class P1018 {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner (System.in);
        
        int A = input.nextInt();
        
        System.out.println(A);

/*a seguinte lógica
576 / 100 = 5
sobra 76 ***essa sobra é importante e precisa estar no código 
5 é a quantidade de vezes que cabe em 100
76 é o resto da divisão */

        
        System.out.println(A/100 + " nota(s) de R$ 100,00");
        A = A % 100;
        System.out.println(A/50 + " nota(s) de R$ 50,00");
        A = A % 50;
        System.out.println(A/20 + " nota(s) de R$ 20,00");
        A = A % 20;
        System.out.println(A/10 + " nota(s) de R$ 10,00");
        A = A % 10;
        System.out.println(A/5 + " nota(s) de R$ 5,00");
        A = A % 5;
        System.out.println(A/2 + " nota(s) de R$ 2,00");
        A = A % 2;
        System.out.println(A/1 + " nota(s) de R$ 1,00");
        input.close();
    }
 
}

/*

Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. 
Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

 */