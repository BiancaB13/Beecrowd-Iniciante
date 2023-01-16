import java.util.Scanner;

public class P1013 {
    public static void main(String[] args) {
 
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int MAIORAB = (a+b+ Math.abs(a-b))/2 ;
        int MAIOR = (MAIORAB+c+ Math.abs(MAIORAB-c))/2 ;
        System.out.println(MAIOR + " eh o maior");
        input.close();
 
    }
}

/*
 
Timelimit: 1
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

MAIORAB = (a+b+ Math.abs(a-b))/2 ;

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

 */